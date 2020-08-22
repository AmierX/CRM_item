package com.javasm.sys.entity;

public class SMPerToReport {
    private Integer pid;

    private String pacc;

    private String pname;

    private String pdept;

    private String pstatus;

    private String ppost;

    private String prole;

    private String paname;

    private String poperation;

    @Override
    public String toString() {
        return "SMPerToReport{" +
                "pid=" + pid +
                ", pacc='" + pacc + '\'' +
                ", pname='" + pname + '\'' +
                ", pdept='" + pdept + '\'' +
                ", pstatus='" + pstatus + '\'' +
                ", ppost='" + ppost + '\'' +
                ", prole='" + prole + '\'' +
                ", paname='" + paname + '\'' +
                ", poperation='" + poperation + '\'' +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPacc() {
        return pacc;
    }

    public void setPacc(String pacc) {
        this.pacc = pacc == null ? null : pacc.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPdept() {
        return pdept;
    }

    public void setPdept(String pdept) {
        this.pdept = pdept == null ? null : pdept.trim();
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus == null ? null : pstatus.trim();
    }

    public String getPpost() {
        return ppost;
    }

    public void setPpost(String ppost) {
        this.ppost = ppost == null ? null : ppost.trim();
    }

    public String getProle() {
        return prole;
    }

    public void setProle(String prole) {
        this.prole = prole == null ? null : prole.trim();
    }

    public String getPaname() {
        return paname;
    }

    public void setPaname(String paname) {
        this.paname = paname == null ? null : paname.trim();
    }

    public String getPoperation() {
        return poperation;
    }

    public void setPoperation(String poperation) {
        this.poperation = poperation == null ? null : poperation.trim();
    }
}