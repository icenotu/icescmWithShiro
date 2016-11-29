package com.icenotu.dao;

import com.icenotu.entity.SysPermission;
import com.icenotu.entity.SysPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionMapper extends BaseMapper<SysPermission>{
    int countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long pmId);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Long pmId);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

    //根据用户id查询一级菜单
    List<SysPermission> findFirstMenuListByUserId(String userid)throws Exception;
    //根据用户id查询二级菜单
    List<SysPermission> findSecondMenuListByUserId(String userid)throws Exception;
    //根据用户id查询权限url
    List<SysPermission> findPermissionListByUserId(String userid)throws Exception;
    //查询一级菜单
    List<SysPermission> findFirstMenuList()throws Exception;
    //查询二级菜单
    List<SysPermission> findSecondMenuList()throws Exception;
    //查询权限url
    List<SysPermission> findPermissionList()throws Exception;
}