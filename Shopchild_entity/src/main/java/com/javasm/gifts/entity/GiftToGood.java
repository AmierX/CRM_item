package com.javasm.gifts.entity;

import java.math.BigDecimal;

public class GiftToGood {
    private Integer gid;

    private String gname;

    private String gtype;

    private BigDecimal gprice;

    private Integer gnum;

    private String gstatus;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype == null ? null : gtype.trim();
    }

    public BigDecimal getGprice() {
        return gprice;
    }

    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }

    public Integer getGnum() {
        return gnum;
    }

    public void setGnum(Integer gnum) {
        this.gnum = gnum;
    }

    public String getGstatus() {
        return gstatus;
    }

    public void setGstatus(String gstatus) {
        this.gstatus = gstatus == null ? null : gstatus.trim();
    }
}