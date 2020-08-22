package com.javasm.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;





public class TableResponseBean {
    private Integer status;
    private String ms;
    private Integer total;
    private Object rows;


    @Override
    public String
    toString() {
        return "TableResponseBean{" +
                "status=" + status +
                ", ms='" + ms + '\'' +
                ", total=" + total +
                ", rows=" + rows +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public String getMs() {
        return ms;
    }

    public Integer getTotal() {
        return total;
    }

    public Object getRows() {
        return rows;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }
}
