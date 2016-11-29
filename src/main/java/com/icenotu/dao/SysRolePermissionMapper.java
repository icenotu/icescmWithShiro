package com.icenotu.dao;

import com.icenotu.entity.SysRolePermission;

import java.util.List;

public interface SysRolePermissionMapper extends BaseMapper<SysRolePermission>{
    int deleteByPrimaryKey(String rmId);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(String rmId);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);

    int deleteByRlId(String rlId) throws Exception;

    List<SysRolePermission> selectByRlId(String rlId) throws Exception;
}