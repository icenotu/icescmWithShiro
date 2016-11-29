package com.icenotu.action;

import com.icenotu.entity.SysParam;
import com.icenotu.service.SupplierService;
import com.icenotu.service.SysParamService;
import com.icenotu.service.SysPermissionService;
import com.icenotu.service.SysRoleService;
import com.icenotu.utils.MyUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016-09-29.
 */
public class SysParamLoadListener implements InitializingBean, ServletContextAware{

    @Resource
    protected SysParamService sysParamService;
    @Resource
    protected SysRoleService sysRoleService;
    @Resource
    protected SysPermissionService sysPermissionService;


    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        MyUtils.readSysParam(sysParamService,servletContext);
        MyUtils.readSysRole(sysRoleService,servletContext);
        MyUtils.readSysPermission(sysPermissionService,servletContext);
    }


}
