package com.icenotu.service.impl;

import com.icenotu.entity.PermissionTree;
import com.icenotu.entity.SysPermission;
import com.icenotu.entity.SysRolePermission;
import com.icenotu.service.SysPermissionService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Administrator on 2016-11-26.
 */
@Service("sysPermission")
public class SysPermissionServiceImpl extends BaseServiceImpl<SysPermission> implements SysPermissionService {
    @Override
    public List<PermissionTree> getPermissionTree() throws Exception {
        List<PermissionTree> treeList = new ArrayList<>();
        Map<String,Boolean> map = new HashMap<>();
        map.put("opened",true);
        PermissionTree permissionTree = new PermissionTree();
        permissionTree.setId("1");
        permissionTree.setParent("#");
        permissionTree.setText("权限");
        permissionTree.setIcon("fa fa-folder icon-state-warning icon-lg");
        permissionTree.setState(map);
        treeList.add(permissionTree);
        List<SysPermission> firstMenuList = sysPermissionMapper.findFirstMenuList();
        for (SysPermission pm:firstMenuList
             ) {
            PermissionTree firstMenuTree = new PermissionTree();
            firstMenuTree.setId(String.valueOf(pm.getPmId())+"folder");
            firstMenuTree.setParent(String.valueOf(pm.getPmParentid()));
            firstMenuTree.setText(pm.getPmName());
            firstMenuTree.setIcon("fa fa-folder icon-state-warning icon-lg");
            PermissionTree menuTreeFolder = new PermissionTree();
            menuTreeFolder.setId(String.valueOf(pm.getPmId())+"menu");
            menuTreeFolder.setParent(String.valueOf(pm.getPmId())+"folder");
            menuTreeFolder.setText("菜单");
            menuTreeFolder.setIcon("fa fa-folder icon-state-warning icon-lg");
            PermissionTree operationTreeFolder = new PermissionTree();
            operationTreeFolder.setId(String.valueOf(pm.getPmId())+"operation");
            operationTreeFolder.setParent(String.valueOf(pm.getPmId())+"folder");
            operationTreeFolder.setText("操作");
            operationTreeFolder.setIcon("fa fa-folder icon-state-warning icon-lg");
            PermissionTree firstMenuFile = new PermissionTree();
            firstMenuFile.setId(String.valueOf(pm.getPmId()));
            firstMenuFile.setParent(String.valueOf(pm.getPmId())+"menu");
            firstMenuFile.setText(pm.getPmName());
            firstMenuFile.setIcon("fa fa-file icon-state-success icon-lg");
            treeList.add(firstMenuTree);
            treeList.add(menuTreeFolder);
            treeList.add(operationTreeFolder);
            treeList.add(firstMenuFile);
        }
        List<SysPermission> secondMenuList = sysPermissionMapper.findSecondMenuList();
        for (SysPermission pm:secondMenuList
             ) {
            PermissionTree secondMenuFile = new PermissionTree();
            secondMenuFile.setId(String.valueOf(pm.getPmId()));
            secondMenuFile.setParent(String.valueOf(pm.getPmParentid())+"menu");
            secondMenuFile.setText(pm.getPmName());
            secondMenuFile.setIcon("fa fa-file icon-state-danger icon-lg");
            PermissionTree secondMenuFolder = new PermissionTree();
            secondMenuFolder.setId(String.valueOf(pm.getPmId())+"folder");
            secondMenuFolder.setParent(String.valueOf(pm.getPmParentid())+"operation");
            secondMenuFolder.setText(pm.getPmName());
            secondMenuFolder.setIcon("fa fa-folder icon-state-warning icon-lg");
            treeList.add(secondMenuFile);
            treeList.add(secondMenuFolder);
        }
        List<SysPermission> permissionList = sysPermissionMapper.findPermissionList();
        for (SysPermission pm:permissionList
             ) {
            PermissionTree permissionFile = new PermissionTree();
            permissionFile.setId(String.valueOf(pm.getPmId()));
            permissionFile.setParent(String.valueOf(pm.getPmParentid())+"folder");
            permissionFile.setText(pm.getPmName());
            permissionFile.setIcon("fa fa-file icon-state-info icon-lg");
            treeList.add(permissionFile);
        }
        return treeList;
    }

    @Override
    public List<SysRolePermission> selectByRlId(String rlId) throws Exception {
        return sysRolePermissionMapper.selectByRlId(rlId);
    }

    @Override
    public int confirmPermission(String rlId, String[] ids) throws Exception {
        int i = 0;
        List<SysRolePermission> sysRolePermissions = new ArrayList<>();
        for (String pmId:ids
             ) {
            String rmId = UUID.randomUUID().toString().replace("-", "");
            SysRolePermission sysRolePermission = new SysRolePermission();
            sysRolePermission.setRmId(rmId);
            sysRolePermission.setRlId(rlId);
            sysRolePermission.setPmId(Long.valueOf(pmId));
            sysRolePermissions.add(sysRolePermission);
        }
        i = sysRolePermissionMapper.deleteByRlId(rlId);
        sysRolePermissionMapper.insertList(sysRolePermissions);
        return i;
    }
}
