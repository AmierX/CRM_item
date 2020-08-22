package com.javasm.productManager.entity;

import java.util.Date;

public class ModifyInfo {
    private Integer rid;

    private String sname;

    private Long oldprice;

    private Long newprice;

    private Date startdate;

    private Integer shenpi;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Long getOldprice() {
        return oldprice;
    }

    public void setOldprice(Long oldprice) {
        this.oldprice = oldprice;
    }

    public Long getNewprice() {
        return newprice;
    }

    public void setNewprice(Long newprice) {
        this.newprice = newprice;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Integer getShenpi() {
        return shenpi;
    }

    public void setShenpi(Integer shenpi) {
        this.shenpi = shenpi;
    }
}