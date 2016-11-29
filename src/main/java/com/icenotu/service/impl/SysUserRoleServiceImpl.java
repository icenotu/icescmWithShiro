package com.icenotu.service.impl;

import com.icenotu.entity.SysUserRole;
import com.icenotu.service.SysUserRoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2016-11-23.
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRole> implements SysUserRoleService {
    @Override
    public List<SysUserRole> selectRoleByUsId(String userId) throws Exception {
        List<SysUserRole> sysUserRoles = sysUserRoleMapper.selectByUsId(userId);
        return sysUserRoles;
    }

    @Override
    public int updateRole(String userId, String[] ids) throws Exception{
        int i = 0;
        try {
            sysUserRoleMapper.deleteByUsId(userId);
            ArrayList<SysUserRole> list = new ArrayList<>();
            for (String id:ids
                    ) {
                SysUserRole sysUserRole = new SysUserRole();
                String urId = UUID.randomUUID().toString().replace("-", "");
                sysUserRole.setUrId(urId);
                sysUserRole.setUsId(userId);
                sysUserRole.setRlId(id);
                list.add(sysUserRole);
            }
            for (SysUserRole ur:list
                 ) {
                System.out.println(ur);
            }
            sysUserRoleMapper.insertList(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
