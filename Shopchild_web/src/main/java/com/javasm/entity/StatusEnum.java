package com.javasm.entity;

public enum  StatusEnum {
    LOGIN_SUC(20001,"登录成功"),
    LOGIN_FAILED(50001,"登陆失败"),
    ADDUSER_SUC(20002,"注册成功"),
    ADDUSER_FAILED(50002,"注册失败"),
    ADD_SUC(20003,"添加成功"),
    ADD_ERROR(50003,"添加失败"),
    UPDATE_SUC(20004,"修改成功"),
    UPDATE_ERROR(50004,"修改失败"),
    DELETE_SUC(20005,"删除成功"),
    DELETE_ERROR(50005,"删除失败"),
    OPERATION_SUC(20003,"操作成功"),
    OPERATION_ERROR(50003,"操作失败");

    private Integer status;
    private String msg;

    @Override
    public String toString() {
        return "StatusEnum{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    StatusEnum() {

    }

    StatusEnum(Integer status, String msg) {

        this.status = status;
        this.msg = msg;
    }
}
