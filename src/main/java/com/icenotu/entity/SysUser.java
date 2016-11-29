package com.icenotu.entity;

import java.io.Serializable;

public class SysUser implements Serializable{
    private static final long serialVersionUID = -3826100450382299049L;
    private String usId;

    private String usUsername;

    private String usPassword;

    private String usSalt;

    private Integer usLocked = 0;

    public String getUsId() {
        return usId;
    }

    public void setUsId(String usId) {
        this.usId = usId == null ? null : usId.trim();
    }

    public String getUsUsername() {
        return usUsername;
    }

    public void setUsUsername(String usUsername) {
        this.usUsername = usUsername == null ? null : usUsername.trim();
    }

    public String getUsPassword() {
        return usPassword;
    }

    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword == null ? null : usPassword.trim();
    }

    public String getUsSalt() {
        return usSalt;
    }

    public void setUsSalt(String usSalt) {
        this.usSalt = usSalt == null ? null : usSalt.trim();
    }

    public Integer getUsLocked() {
        return usLocked;
    }

    public void setUsLocked(Integer usLocked) {
        this.usLocked = usLocked;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "usId='" + usId + '\'' +
                ", usUsername='" + usUsername + '\'' +
                ", usPassword='" + usPassword + '\'' +
                ", usSalt='" + usSalt + '\'' +
                ", usLocked=" + usLocked +
                '}';
    }
}