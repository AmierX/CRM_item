package com.javasm.promotion.entity;

public class Promotion {
    private Integer sid;

    private String sname;

    private String sstime;

    private Double sprice;

    private String sotime;

    private String sapproval;

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

    public String getSstime() {
        return sstime;
    }

    public void setSstime(String sstime) {
        this.sstime = sstime == null ? null : sstime.trim();
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public String getSotime() {
        return sotime;
    }

    public void setSotime(String sotime) {
        this.sotime = sotime == null ? null : sotime.trim();
    }

    public String getSapproval() {
        return sapproval;
    }

    public void setSapproval(String sapproval) {
        this.sapproval = sapproval == null ? null : sapproval.trim();
    }
}