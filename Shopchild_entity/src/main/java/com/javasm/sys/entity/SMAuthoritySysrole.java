package com.javasm.sys.entity;

public class SMAuthoritySysrole {
    private Integer aid;

    private String aname;

    private String asec;

    private String astatus;

    private String aoperation;

    private String rname;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAsec() {
        return asec;
    }

    public void setAsec(String asec) {
        this.asec = asec == null ? null : asec.trim();
    }

    public String getAstatus() {
        return astatus;
    }

    public void setAstatus(String astatus) {
        this.astatus = astatus == null ? null : astatus.trim();
    }

    public String getAoperation() {
        return aoperation;
    }

    public void setAoperation(String aoperation) {
        this.aoperation = aoperation == null ? null : aoperation.trim();
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }
}