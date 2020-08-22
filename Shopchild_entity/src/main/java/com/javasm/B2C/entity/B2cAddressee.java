package com.javasm.B2C.entity;

import java.util.Date;

public class B2cAddressee {
    private Integer adId;

    private Integer adOrderNum;

    private String adAcc;

    private String adPhone;

    private String adMoblePhone;

    private String adPCode;

    private String adAddress;

    private String adRegion;

    private String adPostMoney;

    private Date adTime;

    private String adMail;

    private String adName;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdOrderNum() {
        return adOrderNum;
    }

    public void setAdOrderNum(Integer adOrderNum) {
        this.adOrderNum = adOrderNum;
    }

    public String getAdAcc() {
        return adAcc;
    }

    public void setAdAcc(String adAcc) {
        this.adAcc = adAcc == null ? null : adAcc.trim();
    }

    public String getAdPhone() {
        return adPhone;
    }

    public void setAdPhone(String adPhone) {
        this.adPhone = adPhone == null ? null : adPhone.trim();
    }

    public String getAdMoblePhone() {
        return adMoblePhone;
    }

    public void setAdMoblePhone(String adMoblePhone) {
        this.adMoblePhone = adMoblePhone == null ? null : adMoblePhone.trim();
    }

    public String getAdPCode() {
        return adPCode;
    }

    public void setAdPCode(String adPCode) {
        this.adPCode = adPCode == null ? null : adPCode.trim();
    }

    public String getAdAddress() {
        return adAddress;
    }

    public void setAdAddress(String adAddress) {
        this.adAddress = adAddress == null ? null : adAddress.trim();
    }

    public String getAdRegion() {
        return adRegion;
    }

    public void setAdRegion(String adRegion) {
        this.adRegion = adRegion == null ? null : adRegion.trim();
    }

    public String getAdPostMoney() {
        return adPostMoney;
    }

    public void setAdPostMoney(String adPostMoney) {
        this.adPostMoney = adPostMoney == null ? null : adPostMoney.trim();
    }

    public Date getAdTime() {
        return adTime;
    }

    public void setAdTime(Date adTime) {
        this.adTime = adTime;
    }

    public String getAdMail() {
        return adMail;
    }

    public void setAdMail(String adMail) {
        this.adMail = adMail == null ? null : adMail.trim();
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }
}