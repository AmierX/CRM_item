package com.javasm.productManager.entity;

public class BrandInfo {
    private Integer brandid;

    private String brandname;

    private String brandurl;

    private String branddescribe;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getBrandurl() {
        return brandurl;
    }

    public void setBrandurl(String brandurl) {
        this.brandurl = brandurl == null ? null : brandurl.trim();
    }

    public String getBranddescribe() {
        return branddescribe;
    }

    public void setBranddescribe(String branddescribe) {
        this.branddescribe = branddescribe == null ? null : branddescribe.trim();
    }
}