package com.javasm.sys.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SMSyslog {
    private Integer lid;

    @JsonFormat(pattern = "yyyy.MM.dd HH.mm.ss",timezone = "GMT+8")
    private Date ltime;

    private String lname;

    private String lmodule;

    private String lcontext;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public String getLmodule() {
        return lmodule;
    }

    public void setLmodule(String lmodule) {
        this.lmodule = lmodule == null ? null : lmodule.trim();
    }

    public String getLcontext() {
        return lcontext;
    }

    public void setLcontext(String lcontext) {
        this.lcontext = lcontext == null ? null : lcontext.trim();
    }

    @Override
    public String toString() {
        return "SMSyslog{" +
                "lid=" + lid +
                ", ltime=" + ltime +
                ", lname='" + lname + '\'' +
                ", lmodule='" + lmodule + '\'' +
                ", lcontext='" + lcontext + '\'' +
                '}';
    }
}