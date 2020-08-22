package com.javasm.productManager.entity;

public class YiLeiInfo {
    private Integer id;

    private Integer puhuo;

    private Integer beiji;

    private Long orderprice;

    private Long marketprice;

    private Long shopprice;

    private Integer loweststock;

    private Integer orderable;

    private String sname;

    private Integer sid;

    private Integer shenhe;

    public Integer getShenhe() {
        return shenhe;
    }

    public void setShenhe(Integer shenhe) {
        this.shenhe = shenhe;
    }

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
        this.sname = sname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPuhuo() {
        return puhuo;
    }

    public void setPuhuo(Integer puhuo) {
        this.puhuo = puhuo;
    }

    public Integer getBeiji() {
        return beiji;
    }

    public void setBeiji(Integer beiji) {
        this.beiji = beiji;
    }

    public Long getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Long orderprice) {
        this.orderprice = orderprice;
    }

    public Long getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Long marketprice) {
        this.marketprice = marketprice;
    }

    public Long getShopprice() {
        return shopprice;
    }

    public void setShopprice(Long shopprice) {
        this.shopprice = shopprice;
    }

    public Integer getLoweststock() {
        return loweststock;
    }

    public void setLoweststock(Integer loweststock) {
        this.loweststock = loweststock;
    }

    public Integer getOrderable() {
        return orderable;
    }

    public void setOrderable(Integer orderable) {
        this.orderable = orderable;
    }
}