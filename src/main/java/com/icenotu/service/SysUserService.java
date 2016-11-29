package com.icenotu.service;

import com.icenotu.entity.SysPermission;
import com.icenotu.entity.SysUser;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016-11-17.
 */
public interface SysUserService extends BaseService<SysUser>{
    //根据用户账号查询用户信息
    SysUser findSysUserByUserName(String userName)throws Exception;

    //根据用户id查询权限范围的菜单
    List<SysPermission> findFirstMenuListByUserId(String userId) throws Exception;

    //根据用户id查询权限范围的菜单
    List<SysPermission> findSecondMenuListByUserId(String userId) throws Exception;

    //根据用户id查询权限范围的url
    List<SysPermission> findPermissionListByUserId(String userId) throws Exception;


}
