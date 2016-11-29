package com.icenotu.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016-11-17.
 */
public class ActiveUser implements Serializable{

    private static final long serialVersionUID = -3144377743380344384L;

    private String usId;
    private String usUsername;

    private List<SysPermission> firstMenus;// 一级菜单
    private List<SysPermission> secondMenus;// 二级菜单
    private List<SysPermission> permissions;// 权限

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsId() {
        return usId;
    }

    public void setUsId(String usId) {
        this.usId = usId;
    }

    public String getUsUsername() {
        return usUsername;
    }

    public void setUsUsername(String usUsername) {
        this.usUsername = usUsername;
    }

    public List<SysPermission> getFirstMenus() {
        return firstMenus;
    }

    public void setFirstMenus(List<SysPermission> firstMenus) {
        this.firstMenus = firstMenus;
    }

    public List<SysPermission> getSecondMenus() {
        return secondMenus;
    }

    public void setSecondMenus(List<SysPermission> secondMenus) {
        this.secondMenus = secondMenus;
    }

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "ActiveUser{" +
                "usId='" + usId + '\'' +
                ", usUsername='" + usUsername + '\'' +
                ", firstMenus=" + firstMenus +
                ", secondMenus=" + secondMenus +
                ", permissions=" + permissions +
                '}';
    }
}
