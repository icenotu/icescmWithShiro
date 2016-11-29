package com.icenotu.entity;

public class SysRolePermission {
    private String rmId;

    private String rlId;

    private Long pmId;

    public String getRmId() {
        return rmId;
    }

    public void setRmId(String rmId) {
        this.rmId = rmId == null ? null : rmId.trim();
    }

    public String getRlId() {
        return rlId;
    }

    public void setRlId(String rlId) {
        this.rlId = rlId == null ? null : rlId.trim();
    }

    public Long getPmId() {
        return pmId;
    }

    public void setPmId(Long pmId) {
        this.pmId = pmId;
    }

    @Override
    public String toString() {
        return "SysRolePermission{" +
                "rmId='" + rmId + '\'' +
                ", rlId='" + rlId + '\'' +
                ", pmId=" + pmId +
                '}';
    }
}