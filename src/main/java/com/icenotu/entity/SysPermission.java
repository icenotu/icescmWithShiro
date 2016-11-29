package com.icenotu.entity;

import java.io.Serializable;

public class SysPermission implements Serializable{
    private static final long serialVersionUID = -9195779574178704227L;
    private Long pmId;

    private String pmName;

    private String pmType;

    private String pmUrl;

    private String pmPercode;

    private Long pmParentid;

    private String pmParentids;

    private Boolean pmStatus;

    public Long getPmId() {
        return pmId;
    }

    public void setPmId(Long pmId) {
        this.pmId = pmId;
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName == null ? null : pmName.trim();
    }

    public String getPmType() {
        return pmType;
    }

    public void setPmType(String pmType) {
        this.pmType = pmType == null ? null : pmType.trim();
    }

    public String getPmUrl() {
        return pmUrl;
    }

    public void setPmUrl(String pmUrl) {
        this.pmUrl = pmUrl == null ? null : pmUrl.trim();
    }

    public String getPmPercode() {
        return pmPercode;
    }

    public void setPmPercode(String pmPercode) {
        this.pmPercode = pmPercode == null ? null : pmPercode.trim();
    }

    public Long getPmParentid() {
        return pmParentid;
    }

    public void setPmParentid(Long pmParentid) {
        this.pmParentid = pmParentid;
    }

    public String getPmParentids() {
        return pmParentids;
    }

    public void setPmParentids(String pmParentids) {
        this.pmParentids = pmParentids == null ? null : pmParentids.trim();
    }

    public Boolean getPmStatus() {
        return pmStatus;
    }

    public void setPmStatus(Boolean pmStatus) {
        this.pmStatus = pmStatus;
    }
}