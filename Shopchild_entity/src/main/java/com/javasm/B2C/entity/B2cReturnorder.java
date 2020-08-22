package com.javasm.B2C.entity;

import java.util.List;

public class B2cReturnorder {
    private Integer b2crId;

    private Integer b2crOrderNum;

    private String b2crOrderType;

    private String b2crReason;

    private String b2crOrderOdd;

    private B2cSaleorder b2cSaleorder;

    public B2cSaleorder getB2cSaleorder() {
        return b2cSaleorder;
    }

    public void setB2cSaleorder(B2cSaleorder b2cSaleorder) {
        this.b2cSaleorder = b2cSaleorder;
    }

    public Integer getB2crId() {
        return b2crId;
    }

    public void setB2crId(Integer b2crId) {
        this.b2crId = b2crId;
    }

    public Integer getB2crOrderNum() {
        return b2crOrderNum;
    }

    public void setB2crOrderNum(Integer b2crOrderNum) {
        this.b2crOrderNum = b2crOrderNum;
    }

    public String getB2crOrderType() {
        return b2crOrderType;
    }

    public void setB2crOrderType(String b2crOrderType) {
        this.b2crOrderType = b2crOrderType == null ? null : b2crOrderType.trim();
    }

    public String getB2crReason() {
        return b2crReason;
    }

    public void setB2crReason(String b2crReason) {
        this.b2crReason = b2crReason == null ? null : b2crReason.trim();
    }

    public String getB2crOrderOdd() {
        return b2crOrderOdd;
    }

    public void setB2crOrderOdd(String b2crOrderOdd) {
        this.b2crOrderOdd = b2crOrderOdd == null ? null : b2crOrderOdd.trim();
    }
}