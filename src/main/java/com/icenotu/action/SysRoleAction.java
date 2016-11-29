package com.icenotu.action;

import com.icenotu.entity.PageData;
import com.icenotu.entity.PermissionTree;
import com.icenotu.entity.SysRole;
import com.icenotu.entity.SysRolePermission;
import com.icenotu.service.SysPermissionService;
import com.icenotu.service.SysRoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016-11-23.
 */
@Controller
@RequestMapping("/sysRole")
public class SysRoleAction {
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysPermissionService sysPermissionService;

    @RequestMapping("/select")
    @RequiresPermissions("sysRole:select")
    @ResponseBody
    public PageData<SysRole> select(PageData<SysRole> pageData) {
        try {
            pageData = sysRoleService.selectWithCondition(pageData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageData;
    }

    @RequestMapping("/insert")
    @RequiresPermissions("sysRole:insert")
    @ResponseBody
    public int insert(SysRole sysRole) {
        int i = 0;
        try {
            i = sysRoleService.insert(sysRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
    @RequestMapping("/updatePermission")
    @RequiresPermissions("sysRole:insert")
    @ResponseBody
    public List<PermissionTree> updatePermission(String rlId) {
        System.out.println("updatePermission-rlId--" + rlId);
        List<PermissionTree> permissionTree = null;
        List<SysRolePermission> sysRolePermissions = null;
        try {
            permissionTree = sysPermissionService.getPermissionTree();
            sysRolePermissions = sysPermissionService.selectByRlId(rlId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (SysRolePermission srp:sysRolePermissions
             ) {
            System.out.println(srp);
        }
        for (SysRolePermission srp:sysRolePermissions
             ) {
            for (PermissionTree pt:permissionTree
                    ) {
                if (srp.getPmId().toString().equals(pt.getId())) {
                    Map<String, Boolean> map = new HashMap<>();
                    map.put("selected", true);
                    pt.setState(map);
                }
            }
        }

        return permissionTree;
    }

    @RequestMapping("/confirmPermission")
    @RequiresPermissions("sysRole:insert")
    @ResponseBody
    public int confirmPermission(String rlId, String[] ids) {
        int i = 0;
        for (String id:ids
             ) {
            System.out.println("pmid--" + id);
        }
        System.out.println("confirmPermission-rlId--" + rlId);
        try {
            i = sysPermissionService.confirmPermission(rlId, ids);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
