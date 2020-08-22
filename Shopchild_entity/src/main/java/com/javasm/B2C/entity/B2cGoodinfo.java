package com.javasm.B2C.entity;

public class B2cGoodinfo {
    private Integer b2cgId;

    private Integer b2cgOrderNum;

    private Integer b2cgCode;

    private String b2cgName;

    private Double b2cgPrice;

    private Integer b2cgNum;

    private Double b2cgTProce;

    public Integer getB2cgId() {
        return b2cgId;
    }

    public void setB2cgId(Integer b2cgId) {
        this.b2cgId = b2cgId;
    }

    public Integer getB2cgOrderNum() {
        return b2cgOrderNum;
    }

    public void setB2cgOrderNum(Integer b2cgOrderNum) {
        this.b2cgOrderNum = b2cgOrderNum;
    }

    public Integer getB2cgCode() {
        return b2cgCode;
    }

    public void setB2cgCode(Integer b2cgCode) {
        this.b2cgCode = b2cgCode;
    }

    public String getB2cgName() {
        return b2cgName;
    }

    public void setB2cgName(String b2cgName) {
        this.b2cgName = b2cgName == null ? null : b2cgName.trim();
    }

    public Double getB2cgPrice() {
        return b2cgPrice;
    }

    public void setB2cgPrice(Double b2cgPrice) {
        this.b2cgPrice = b2cgPrice;
    }

    public Integer getB2cgNum() {
        return b2cgNum;
    }

    public void setB2cgNum(Integer b2cgNum) {
        this.b2cgNum = b2cgNum;
    }

    public Double getB2cgTProce() {
        return b2cgTProce;
    }

    public void setB2cgTProce(Double b2cgTProce) {
        this.b2cgTProce = b2cgTProce;
    }
}