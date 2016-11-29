package com.icenotu.dao;

import com.icenotu.entity.SysUserRole;

import java.util.HashMap;
import java.util.List;

public interface SysUserRoleMapper extends BaseMapper<SysUserRole>{
    int deleteByUsId(String usId);
    List<SysUserRole> selectByUsId(String usId);
    int insertSelective(SysUserRole record);
}