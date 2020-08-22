package com.javasm.aftersale.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Salesreturn {
    private Integer id;

    private Integer snumber;

    private String applyname;

    private String applywhy;

    private String recorder;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date recorddate;

    private String approver;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date approvedate;

    private String status;

    private String approveopinion;

    private String approveresult;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsnumber() {
        return snumber;
    }

    public void setsnumber(Integer snumber) {
        this.snumber = snumber;
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname == null ? null : applyname.trim();
    }

    public String getApplywhy() {
        return applywhy;
    }

    public void setApplywhy(String applywhy) {
        this.applywhy = applywhy == null ? null : applywhy.trim();
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder == null ? null : recorder.trim();
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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