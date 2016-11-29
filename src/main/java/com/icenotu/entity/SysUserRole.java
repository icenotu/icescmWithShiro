package com.icenotu.entity;

import java.io.Serializable;

public class SysUserRole implements Serializable {
    private static final long serialVersionUID = -998783977039626168L;
    private String urId;

    private String usId;

    private String rlId;

    public String getUrId() {
        return urId;
    }

    public void setUrId(String urId) {
        this.urId = urId == null ? null : urId.trim();
    }

    public String getUsId() {
        return usId;
    }

    public void setUsId(String usId) {
        this.usId = usId == null ? null : usId.trim();
    }

    public String getRlId() {
        return rlId;
    }

    public void setRlId(String rlId) {
        this.rlId = rlId == null ? null : rlId.trim();
    }

    @Override
    public String toString() {
        return "SysUserRole{" +
                "urId='" + urId + '\'' +
                ", usId='" + usId + '\'' +
                ", rlId='" + rlId + '\'' +
                '}';
    }
}