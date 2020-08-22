package com.javasm.B2C.entity;

import java.util.Date;

public class B2cReturngoods {
    private Integer b2crdId;

    private String b2crdInitName;

    private Date b2crdInitDate;

    private Integer b2crdNum;

    private B2cReturnorder returnorder;

    public B2cReturnorder getReturnorder() {
        return returnorder;
    }

    public void setReturnorder(B2cReturnorder returnorder) {
        this.returnorder = returnorder;
    }

    public Integer getB2crdNum() {
        return b2crdNum;
    }

    public void setB2crdNum(Integer b2crdNum) {
        this.b2crdNum = b2crdNum;
    }

    public Integer getB2crdId() {
        return b2crdId;
    }

    public void setB2crdId(Integer b2crdId) {
        this.b2crdId = b2crdId;
    }

    public String getB2crdInitName() {
        return b2crdInitName;
    }

    public void setB2crdInitName(String b2crdInitName) {
        this.b2crdInitName = b2crdInitName == null ? null : b2crdInitName.trim();
    }

    public Date getB2crdInitDate() {
        return b2crdInitDate;
    }

    public void setB2crdInitDate(Date b2crdInitDate) {
        this.b2crdInitDate = b2crdInitDate;
    }
}