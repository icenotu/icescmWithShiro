package com.icenotu.service.impl;

import com.icenotu.entity.SysPermission;
import com.icenotu.entity.SysUser;
import com.icenotu.entity.SysUserExample;
import com.icenotu.service.SysUserService;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Administrator on 2016-11-17.
 */
@Service("sysUserService")
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService {
    @Override
    public SysUser findSysUserByUserName(String userName) throws Exception {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andUsUsernameEqualTo(userName);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        if (sysUsers != null && sysUsers.size() == 1) {
            return sysUsers.get(0);
        }
        return null;
    }

    @Override
    public List<SysPermission> findFirstMenuListByUserId(String userId) throws Exception {
        return sysPermissionMapper.findFirstMenuListByUserId(userId);
    }

    @Override
    public List<SysPermission> findSecondMenuListByUserId(String userId) throws Exception {
        return sysPermissionMapper.findSecondMenuListByUserId(userId);
    }

    @Override
    public List<SysPermission> findPermissionListByUserId(String userId) throws Exception {
        return sysPermissionMapper.findPermissionListByUserId(userId);
    }


    @Override
    public int insert(SysUser entity) throws Exception {
        String usId = UUID.randomUUID().toString().replace("-", "");
        entity.setUsId(usId);
        String salt = RandomStringUtils.randomAlphanumeric(6);
        entity.setUsSalt(salt);
        int hashIterations = 1;
        String usPassword = new Md5Hash(entity.getUsPassword(), salt, hashIterations).toString();
        entity.setUsPassword(usPassword);
        return super.insert(entity);
    }

    @Override
    public int update(SysUser entity) throws Exception {
        String salt = RandomStringUtils.randomAlphanumeric(6);
        entity.setUsSalt(salt);
        int hashIterations = 1;
        String usPassword = new Md5Hash(entity.getUsPassword(), salt, hashIterations).toString();
        entity.setUsPassword(usPassword);
        return sysUserMapper.updateByPrimaryKey(entity);
    }
}
