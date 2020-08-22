package com.javasm.aftersale.entity;

public class Maintenancepoint {
    private Integer id;

    private String companyname;

    private String companysite;

    private String hotline;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanysite() {
        return companysite;
    }

    public void setCompanysite(String companysite) {
        this.companysite = companysite == null ? null : companysite.trim();
    }

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline == null ? null : hotline.trim();
    }
}