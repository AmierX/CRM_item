package com.javasm.sys.entity;

public class SMSysdept {
    private Integer id;

    private String dname;

    private String disok;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDisok() {
        return disok;
    }

    public void setDisok(String disok) {
        this.disok = disok == null ? null : disok.trim();
    }

    @Override
    public String toString() {
        return "SMSysdept{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                ", disok='" + disok + '\'' +
                '}';
    }
}