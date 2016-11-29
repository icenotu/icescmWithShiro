package com.icenotu.service.impl;

import com.icenotu.entity.SysRole;
import com.icenotu.service.SysRoleService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Administrator on 2016-11-23.
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole> implements SysRoleService {
    @Override
    public int insert(SysRole entity) throws Exception {
        String rlId = UUID.randomUUID().toString().replace("-", "");
        entity.setRlId(rlId);
        return super.insert(entity);
    }
}
