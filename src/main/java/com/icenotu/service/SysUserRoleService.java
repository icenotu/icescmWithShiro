package com.icenotu.service;

import com.icenotu.entity.SysUserRole;

import java.util.List;

/**
 * Created by Administrator on 2016-11-23.
 */
public interface SysUserRoleService extends BaseService<SysUserRole> {
    //根据用户id查找其拥有的角色
    List<SysUserRole> selectRoleByUsId(String userId) throws Exception;

    /**
     *
     * @param userId 用户id
     * @param ids 用户角色id数组
     * @return
     */
    //修改用户角色
    int updateRole(String userId, String[] ids) throws Exception;
}
