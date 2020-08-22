package com.javasm.entity;

public class ResponseBean {
    private Integer status;
    private String ms;
    private Object datas;

    @Override
    public String toString() {
        return "ResponseBean{" +
                "status=" + status +
                ", ms='" + ms + '\'' +
                ", datas=" + datas +
                '}';
    }

    public ResponseBean(Object datas) {
        this.datas = datas;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public Object getDatas() {
        return datas;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }

    public ResponseBean() {
    }

    public ResponseBean(StatusEnum statusEnum) {
        this.status = statusEnum.getStatus();
        this.ms = statusEnum.getMsg();
    }

    public ResponseBean(StatusEnum statusEnum, Object datas) {
        this.status = statusEnum.getStatus();
        this.ms = statusEnum.getMsg();
        this.datas = datas;
    }
}
