package com.javasm.process.entity;

public class ProcessInfo {
    private String pid;

    private String pname;

    private Integer plevel;

    private String prole;

    private String pcreatedate;

    private Integer pstatus;

    private String deploymentid;

    public String getDeploymentid() {
        return deploymentid;
    }

    public void setDeploymentid(String deploymentid) {
        this.deploymentid = deploymentid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getPlevel() {
        return plevel;
    }

    public void setPlevel(Integer plevel) {
        this.plevel = plevel;
    }

    public String getProle() {
        return prole;
    }

    public void setProle(String prole) {
        this.prole = prole == null ? null : prole.trim();
    }

    public String getPcreatedate() {
        return pcreatedate;
    }

    public void setPcreatedate(String pcreatedate) {
        this.pcreatedate = pcreatedate == null ? null : pcreatedate.trim();
    }

    public Integer getPstatus() {
        return pstatus;
    }

    public void setPstatus(Integer pstatus) {
        this.pstatus = pstatus;
    }
}