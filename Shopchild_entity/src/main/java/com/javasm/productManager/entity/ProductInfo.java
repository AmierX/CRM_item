package com.javasm.productManager.entity;

public class ProductInfo {
    private Integer sid;

    private String sname;

    private String stype;

    private String sbrand;

    private String smodel;

    private String scolor;

    private String sstorecode;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getSbrand() {
        return sbrand;
    }

    public void setSbrand(String sbrand) {
        this.sbrand = sbrand == null ? null : sbrand.trim();
    }

    public String getSmodel() {
        return smodel;
    }

    public void setSmodel(String smodel) {
        this.smodel = smodel == null ? null : smodel.trim();
    }

    public String getScolor() {
        return scolor;
    }

    public void setScolor(String scolor) {
        this.scolor = scolor == null ? null : scolor.trim();
    }

    public String getSstorecode() {
        return sstorecode;
    }

    public void setSstorecode(String sstorecode) {
        this.sstorecode = sstorecode == null ? null : sstorecode.trim();
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", stype='" + stype + '\'' +
                ", sbrand='" + sbrand + '\'' +
                ", smodel='" + smodel + '\'' +
                ", scolor='" + scolor + '\'' +
                ", sstorecode='" + sstorecode + '\'' +
                '}';
    }
}