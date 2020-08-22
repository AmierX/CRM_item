package com.javasm.B2C.entity;

import java.util.Date;

public class B2cSaleorder {
    private Integer b2cId;

    private Integer b2cNum;

    private String b2cOrderType;

    private String b2cOrderHandle;

    private String b2cService;

    private String b2cPayType;

    private String b2cPost;

    private String b2corderStatus;

    private Date b2cInitDate;

    private String b2cdorderStatus;

    public Integer getB2cId() {
        return b2cId;
    }

    public void setB2cId(Integer b2cId) {
        this.b2cId = b2cId;
    }

    public Integer getB2cNum() {
        return b2cNum;
    }

    public void setB2cNum(Integer b2cNum) {
        this.b2cNum = b2cNum;
    }

    public String getB2cOrderType() {
        return b2cOrderType;
    }

    public void setB2cOrderType(String b2cOrderType) {
        this.b2cOrderType = b2cOrderType == null ? null : b2cOrderType.trim();
    }

    public String getB2cOrderHandle() {
        return b2cOrderHandle;
    }

    public void setB2cOrderHandle(String b2cOrderHandle) {
        this.b2cOrderHandle = b2cOrderHandle == null ? null : b2cOrderHandle.trim();
    }

    public String getB2cService() {
        return b2cService;
    }

    public void setB2cService(String b2cService) {
        this.b2cService = b2cService == null ? null : b2cService.trim();
    }

    public String getB2cPayType() {
        return b2cPayType;
    }

    public void setB2cPayType(String b2cPayType) {
        this.b2cPayType = b2cPayType == null ? null : b2cPayType.trim();
    }

    public String getB2cPost() {
        return b2cPost;
    }

    public void setB2cPost(String b2cPost) {
        this.b2cPost = b2cPost == null ? null : b2cPost.trim();
    }

    public String getB2corderStatus() {
        return b2corderStatus;
    }

    public void setB2corderStatus(String b2corderStatus) {
        this.b2corderStatus = b2corderStatus == null ? null : b2corderStatus.trim();
    }

    public Date getB2cInitDate() {
        return b2cInitDate;
    }

    public void setB2cInitDate(Date b2cInitDate) {
        this.b2cInitDate = b2cInitDate;
    }

    public String getB2cdorderStatus() {
        return b2cdorderStatus;
    }

    public void setB2cdorderStatus(String b2cdorderStatus) {
        this.b2cdorderStatus = b2cdorderStatus == null ? null : b2cdorderStatus.trim();
    }
}