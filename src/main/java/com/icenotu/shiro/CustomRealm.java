package com.icenotu.shiro;

import com.icenotu.entity.ActiveUser;
import com.icenotu.entity.SysPermission;
import com.icenotu.entity.SysUser;
import com.icenotu.service.SysUserService;
import com.icenotu.service.impl.SysUserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016-11-16.
 */
public class CustomRealm extends AuthorizingRealm{


    @Autowired
    private SysUserService sysUserService;

    // 设置realm的名称
    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }
    //用于认证的方法
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        authenticationToken是用户输入的用户名和密码
//        第一步从authenticationToken中取出用户名
        String userName = (String) authenticationToken.getPrincipal();
//        第二步：根据用户输入的用户名查询数据库
        SysUser sysUser = null;
        try {
            sysUser = sysUserService.findSysUserByUserName(userName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("realm"+sysUser);
//        如果查询不到该用户则返回null
        if (sysUser == null) {
            return null;
        }
//        第三步：从数据库中查询密码和盐
        String password = sysUser.getUsPassword();
        String salt = sysUser.getUsSalt();
        //如果查询到则返回认证信息AuthorizationInfo
        //activeUser就是用户身份信息
        ActiveUser activeUser = new ActiveUser();
        activeUser.setUsId(sysUser.getUsId());
        activeUser.setUsUsername(sysUser.getUsUsername());
        //根据用户id取出菜单
        List<SysPermission> firstMenus = null;
        List<SysPermission> secondMenus = null;
        try {
            firstMenus = sysUserService.findFirstMenuListByUserId(sysUser.getUsId());
            secondMenus = sysUserService.findSecondMenuListByUserId(sysUser.getUsId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        activeUser.setFirstMenus(firstMenus);
        activeUser.setSecondMenus(secondMenus);
        //最后将activeUser设置成simpleAuthenticationInfo
        SimpleAuthenticationInfo simpleAuthenticationInfo
                = new SimpleAuthenticationInfo(activeUser, password,
                ByteSource.Util.bytes(salt), this.getName());
        System.out.println(simpleAuthenticationInfo.getPrincipals().getPrimaryPrincipal());

        //登录成功后在Session中绑定用户信息，这样跳转页面就不会丢失认证信息，且在任意url登录成功后都能获取认证信息
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.setAttribute("activeUser", activeUser);
        return simpleAuthenticationInfo;
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //从 principals获取主身份信息
        //将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
        ActiveUser activeUser = (ActiveUser) principalCollection.getPrimaryPrincipal();
        //根据身份信息获取权限信息
        //从数据库获取到权限数据
        List<SysPermission> permissionList = null;
        try {
            permissionList = sysUserService.findPermissionListByUserId(activeUser.getUsId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        for (SysPermission sysPermission:permissionList
             ) {
            simpleAuthorizationInfo.addStringPermission(sysPermission.getPmPercode());
        }
        System.out.println("授权---"+simpleAuthorizationInfo.getStringPermissions());
        return simpleAuthorizationInfo;
    }

    //清除缓存
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }
}
