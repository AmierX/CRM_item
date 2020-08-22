package com.javasm.B2C.entity;

public class B2cShoporde {
    private Integer b2cwId;

    private Integer b2cwNum;

    private String b2cwOrderType;

    private String b2cwGoods;

    private String b2cwService;

    private String b2cwPayType;

    private String b2cwPost;

    private String b2cwPrderStatus;

    public Integer getB2cwId() {
        return b2cwId;
    }

    public void setB2cwId(Integer b2cwId) {
        this.b2cwId = b2cwId;
    }

    public Integer getB2cwNum() {
        return b2cwNum;
    }

    public void setB2cwNum(Integer b2cwNum) {
        this.b2cwNum = b2cwNum;
    }

    public String getB2cwOrderType() {
        return b2cwOrderType;
    }

    public void setB2cwOrderType(String b2cwOrderType) {
        this.b2cwOrderType = b2cwOrderType == null ? null : b2cwOrderType.trim();
    }

    public String getB2cwGoods() {
        return b2cwGoods;
    }

    public void setB2cwGoods(String b2cwGoods) {
        this.b2cwGoods = b2cwGoods == null ? null : b2cwGoods.trim();
    }

    public String getB2cwService() {
        return b2cwService;
    }

    public void setB2cwService(String b2cwService) {
        this.b2cwService = b2cwService == null ? null : b2cwService.trim();
    }

    public String getB2cwPayType() {
        return b2cwPayType;
    }

    public void setB2cwPayType(String b2cwPayType) {
        this.b2cwPayType = b2cwPayType == null ? null : b2cwPayType.trim();
    }

    public String getB2cwPost() {
        return b2cwPost;
    }

    public void setB2cwPost(String b2cwPost) {
        this.b2cwPost = b2cwPost == null ? null : b2cwPost.trim();
    }

    public String getB2cwPrderStatus() {
        return b2cwPrderStatus;
    }

    public void setB2cwPrderStatus(String b2cwPrderStatus) {
        this.b2cwPrderStatus = b2cwPrderStatus == null ? null : b2cwPrderStatus.trim();
    }
}