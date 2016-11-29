package com.icenotu.utils;

import com.icenotu.entity.SysParam;
import com.icenotu.entity.SysPermission;
import com.icenotu.entity.SysRole;
import com.icenotu.service.BaseService;
import com.icenotu.service.SysParamService;
import com.icenotu.service.SysPermissionService;
import com.icenotu.service.SysRoleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016-10-01.
 */
public class MyUtils {
    public static void readSysParam(SysParamService sysParamService,ServletContext servletContext) {
        Map<String, Object> sysParamMap = new HashMap<>();
        /*Map<String, Object> supTypeMap = new HashMap<>();
        Map<String, Object> goodsColorMap = new HashMap<>();*/
        HashSet<String> typeSet = new HashSet<>();
        try {
            List<SysParam> sysParamList = sysParamService.select();
            for (SysParam spl:sysParamList
                    ) {
                typeSet.add(spl.getSysParamField());
                /*switch (spl.getSysParamField()) {
                    case "supType":
                        supTypeMap.put(spl.getSysParamValue(),spl.getSysParamText());
                        break;
                    case "goodsColor":
                        goodsColorMap.put(spl.getSysParamValue(), spl.getSysParamText());
                        break;
                    default:
                        break;
                }*/
            }

            for (String s:typeSet
                    ) {
                Map<String, Object> a = new HashMap<>();
                for (SysParam spl:sysParamList
                        ) {
                    if (s.equals(spl.getSysParamField())) {
                        a.put(spl.getSysParamValue(), spl.getSysParamText());
                    }
                }
                sysParamMap.put(s,a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

//        sysParamMap.put("supType", supTypeMap);
//        sysParamMap.put("goodsColors", goodsColorMap);
        System.out.println(sysParamMap);
        servletContext.setAttribute("sysParamMap",sysParamMap);
    }

    public static void readSysRole(SysRoleService sysRoleService, ServletContext servletContext) {
        try {
            List<SysRole> sysRole = sysRoleService.select();
            System.out.println(sysRole);
            servletContext.setAttribute("sysRole",sysRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readSysPermission(SysPermissionService sysPermissionService, ServletContext servletContext) {
        try {
            List<SysPermission> sysPermissions = sysPermissionService.select();
            System.out.println(sysPermissions);
            servletContext.setAttribute("sysPermissions",sysPermissions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
