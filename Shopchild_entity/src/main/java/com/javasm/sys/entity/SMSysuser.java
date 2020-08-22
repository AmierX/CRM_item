package com.javasm.sys.entity;

import java.util.Date;

public class SMSysuser {
    private Integer uid;

    private String uname;

    private String uacc;

    private String upass;

    @Override
    public String toString() {
        return "SMSysuser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uacc='" + uacc + '\'' +
                ", upass='" + upass + '\'' +
                ", inittime=" + inittime +
                ", lastlogin=" + lastlogin +
                ", urole='" + urole + '\'' +
                ", uphone='" + uphone + '\'' +
                ", status='" + status + '\'' +
                ", upost='" + upost + '\'' +
                ", udept='" + udept + '\'' +
                '}';
    }

    private Date inittime;

    private Date lastlogin;

    private String urole;

    private String uphone;

    private String status;

    private String upost;

    private String udept;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUacc() {
        return uacc;
    }

    public void setUacc(String uacc) {
        this.uacc = uacc == null ? null : uacc.trim();
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass == null ? null : upass.trim();
    }

    public Date getInittime() {
        return inittime;
    }

    public void setInittime(Date inittime) {
        this.inittime = inittime;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getUrole() {
        return urole;
    }

    public void setUrole(String urole) {
        this.urole = urole == null ? null : urole.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUpost() {
        return upost;
    }

    public void setUpost(String upost) {
        this.upost = upost == null ? null : upost.trim();
    }

    public String getUdept() {
        return udept;
    }

    public void setUdept(String udept) {
        this.udept = udept == null ? null : udept.trim();
    }
}