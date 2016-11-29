package com.icenotu.service;

import com.icenotu.entity.PermissionTree;
import com.icenotu.entity.SysPermission;
import com.icenotu.entity.SysRolePermission;

import java.util.List;

/**
 * Created by Administrator on 2016-11-26.
 */
public interface SysPermissionService extends BaseService<SysPermission> {
    List<PermissionTree> getPermissionTree() throws Exception;

    List<SysRolePermission> selectByRlId(String rlId) throws Exception;

    int confirmPermission(String rlId, String[] ids) throws Exception;
}
