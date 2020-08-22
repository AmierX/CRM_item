package com.javasm.aftersale.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Returnfactorychuku {
    private Integer id;

    private String outkudan;

    private String outkustatus;

    private String zhidanren;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date zhidandate;

    private String approver;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date approvedate;

    private String approvestatus;

    private String approveopinion;

    private String approveresult;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutkudan() {
        return outkudan;
    }

    public void setOutkudan(String outkudan) {
        this.outkudan = outkudan == null ? null : outkudan.trim();
    }

    public String getOutkustatus() {
        return outkustatus;
    }

    public void setOutkustatus(String outkustatus) {
        this.outkustatus = outkustatus == null ? null : outkustatus.trim();
    }

    public String getZhidanren() {
        return zhidanren;
    }

    public void setZhidanren(String zhidanren) {
        this.zhidanren = zhidanren == null ? null : zhidanren.trim();
    }

    public Date getZhidandate() {
        return zhidandate;
    }

    public void setZhidandate(Date zhidandate) {
        this.zhidandate = zhidandate;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public Date getApprovedate() {
        return approvedate;
    }

    public void setApprovedate(Date approvedate) {
        this.approvedate = approvedate;
    }

    public String getApprovestatus() {
        return approvestatus;
    }

    public void setApprovestatus(String approvestatus) {
        this.approvestatus = approvestatus == null ? null : approvestatus.trim();
    }

    public String getApproveopinion() {
        return approveopinion;
    }

    public void setApproveopinion(String approveopinion) {
        this.approveopinion = approveopinion == null ? null : approveopinion.trim();
    }

    public String getApproveresult() {
        return approveresult;
    }

    public void setApproveresult(String approveresult) {
        this.approveresult = approveresult == null ? null : approveresult.trim();
    }
}