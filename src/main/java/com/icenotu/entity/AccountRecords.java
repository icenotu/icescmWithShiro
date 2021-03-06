package com.icenotu.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AccountRecords implements Serializable{
    private static final long serialVersionUID = 7330276382777896099L;

    private String arId;

    private String supId;

    private Date arDate;

    private String arOrderId;

    private String arBusType;

    private BigDecimal arPayable;

    private BigDecimal arPaid;

    private BigDecimal arArrears;

    private BigDecimal arDiscount;

    private String arAttn;

    private Integer arOperator;

    private String arRemark;

    public String getArId() {
        return arId;
    }

    public void setArId(String arId) {
        this.arId = arId == null ? null : arId.trim();
    }

    public String getSupId() {
        return supId;
    }

    public void setSupId(String supId) {
        this.supId = supId;
    }

    public Date getArDate() {
        return arDate;
    }

    public void setArDate(Date arDate) {
        this.arDate = arDate;
    }

    public String getArOrderId() {
        return arOrderId;
    }

    public void setArOrderId(String arOrderId) {
        this.arOrderId = arOrderId == null ? null : arOrderId.trim();
    }

    public String getArBusType() {
        return arBusType;
    }

    public void setArBusType(String arBusType) {
        this.arBusType = arBusType == null ? null : arBusType.trim();
    }

    public BigDecimal getArPayable() {
        return arPayable;
    }

    public void setArPayable(BigDecimal arPayable) {
        this.arPayable = arPayable;
    }

    public BigDecimal getArPaid() {
        return arPaid;
    }

    public void setArPaid(BigDecimal arPaid) {
        this.arPaid = arPaid;
    }

    public BigDecimal getArArrears() {
        return arArrears;
    }

    public void setArArrears(BigDecimal arArrears) {
        this.arArrears = arArrears;
    }

    public BigDecimal getArDiscount() {
        return arDiscount;
    }

    public void setArDiscount(BigDecimal arDiscount) {
        this.arDiscount = arDiscount;
    }

    public String getArAttn() {
        return arAttn;
    }

    public void setArAttn(String arAttn) {
        this.arAttn = arAttn == null ? null : arAttn.trim();
    }

    public Integer getArOperator() {
        return arOperator;
    }

    public void setArOperator(Integer arOperator) {
        this.arOperator = arOperator;
    }

    public String getArRemark() {
        return arRemark;
    }

    public void setArRemark(String arRemark) {
        this.arRemark = arRemark == null ? null : arRemark.trim();
    }
}