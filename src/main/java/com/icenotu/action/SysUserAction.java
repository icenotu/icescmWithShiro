package com.icenotu.action;

import com.icenotu.entity.PageData;
import com.icenotu.entity.SysRole;
import com.icenotu.entity.SysUser;
import com.icenotu.entity.SysUserRole;
import com.icenotu.exception.CustomException;
import com.icenotu.exception.CustomExceptionResolver;
import com.icenotu.service.SysRoleService;
import com.icenotu.service.SysUserRoleService;
import com.icenotu.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016-11-17.
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserAction extends BaseAction {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysUserRoleService sysUserRoleService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model) throws Exception {
        System.out.println("sysUser---"+request.getParameter("username"));
        //如果登录失败，从request域中获取异常信息
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        System.out.println("sysExt"+exceptionClassName);
        String error = null;
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名不存在";
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if ("randomCodeError".equals(exceptionClassName)) {
            error = "验证码错误";
        } else if (exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
        }
        model.addAttribute("error", error);
        return "/login.jsp";

        /*CustomExceptionResolver resolver = new CustomExceptionResolver();
        if(exceptionClassName!=null){
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                //最终会抛给异常处理器
//                throw new CustomException("账号不存在");
                resolver.resolveException(request,response,handler,new CustomException("账号不存在"));
            } else if (IncorrectCredentialsException.class.getName().equals(
                    exceptionClassName)) {
                throw new CustomException("用户名/密码错误");
            } else {
                throw new Exception();//最终在异常处理器生成未知错误
            }
        }
        //此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
        //登陆失败还到login页面
        return "/login.jsp";*/
    }

    @RequestMapping("/select")
    @RequiresPermissions("sysUser:select")
    @ResponseBody
    public PageData<SysUser> select(PageData<SysUser> pageData) {
        try {
            pageData = sysUserService.selectWithCondition(pageData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("sysUser"+pageData);
        return pageData;
    }

    @RequestMapping("/insert")
    @RequiresPermissions("sysUser:insert")
    @ResponseBody
    public int insert(SysUser sysUser) {
        int i = 0;
        try {
            i = sysUserService.insert(sysUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    @RequestMapping("/update")
    @RequiresPermissions("sysUser:update")
    @ResponseBody
    public int update(SysUser sysUser) {
        int i = 0;
//        System.out.println("updateRoles123456");
        try {
            i = sysUserService.update(sysUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        String[] sysRoles = request.getParameterValues("sysRoles");
//        System.out.println(sysRoles);
//        System.out.println(rows);
        return i;
    }

    @RequestMapping("/selectRole")
    @RequiresPermissions("sysUser:updateRole")
    @ResponseBody
    public List<SysUserRole> update(String usId) {
        List<SysUserRole> hadRoles = null;
        try {
            System.out.println("selectRoleUsId---"+usId);
            hadRoles = sysUserRoleService.selectRoleByUsId(usId);
            System.out.println("selectRoleMap---"+hadRoles);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return hadRoles;
    }

    @RequestMapping("/updateRole")
    @RequiresPermissions("sysUser:updateRole")
    @ResponseBody
    public int updateRole(String usId,String[] ids) {
        int i = 1;
        try {
            sysUserRoleService.updateRole(usId, ids);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
