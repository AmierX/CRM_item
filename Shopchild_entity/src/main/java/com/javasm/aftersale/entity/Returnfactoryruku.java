package com.javasm.aftersale.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Returnfactoryruku {
    private Integer id;

    private String rukudanhao;

    private String rukustatus;

    private String zhidanren;

    private String returnsite;

    private String why;

    private String beizhu;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date zhidandate;

    private String approver;

    private String approveopinion;

    private String approveresult;

    private String approvestatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRukudanhao() {
        return rukudanhao;
    }

    public void setRukudanhao(String rukudanhao) {
        this.rukudanhao = rukudanhao == null ? null : rukudanhao.trim();
    }

    public String getRukustatus() {
        return rukustatus;
    }

    public void setRukustatus(String rukustatus) {
        this.rukustatus = rukustatus == null ? null : rukustatus.trim();
    }

    public String getZhidanren() {
        return zhidanren;
    }

    public void setZhidanren(String zhidanren) {
        this.zhidanren = zhidanren == null ? null : zhidanren.trim();
    }

    public String getReturnsite() {
        return returnsite;
    }

    public void setReturnsite(String returnsite) {
        this.returnsite = returnsite == null ? null : returnsite.trim();
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why == null ? null : why.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
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

    public String getApprovestatus() {
        return approvestatus;
    }

    public void setApprovestatus(String approvestatus) {
        this.approvestatus = approvestatus == null ? null : approvestatus.trim();
    }
}