package com.icenotu.entity;

import java.io.Serializable;

public class SysRole implements Serializable{
    private static final long serialVersionUID = -3671219206864176699L;
    private String rlId;

    private String rlName;

    private Integer rlStatus = 1;

    public String getRlId() {
        return rlId;
    }

    public void setRlId(String rlId) {
        this.rlId = rlId == null ? null : rlId.trim();
    }

    public String getRlName() {
        return rlName;
    }

    public void setRlName(String rlName) {
        this.rlName = rlName == null ? null : rlName.trim();
    }

    public Integer getRlStatus() {
        return rlStatus;
    }

    public void setRlStatus(Integer rlStatus) {
        this.rlStatus = rlStatus;
    }
}