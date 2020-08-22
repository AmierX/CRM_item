package com.javasm.sys.entity;

public class SMSysrole {
    private Integer rid;

    private String rencod;

    private String rname;

    private String rdec;

    private String rstatus;

    private String rdept;

    private String rauthority;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRencod() {
        return rencod;
    }

    public void setRencod(String rencod) {
        this.rencod = rencod == null ? null : rencod.trim();
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRdec() {
        return rdec;
    }

    public void setRdec(String rdec) {
        this.rdec = rdec == null ? null : rdec.trim();
    }

    public String getRstatus() {
        return rstatus;
    }

    public void setRstatus(String rstatus) {
        this.rstatus = rstatus == null ? null : rstatus.trim();
    }

    public String getRdept() {
        return rdept;
    }

    public void setRdept(String rdept) {
        this.rdept = rdept == null ? null : rdept.trim();
    }

    public String getRauthority() {
        return rauthority;
    }

    public void setRauthority(String rauthority) {
        this.rauthority = rauthority == null ? null : rauthority.trim();
    }
}