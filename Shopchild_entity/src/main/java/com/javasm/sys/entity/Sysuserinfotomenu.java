package com.javasm.sys.entity;

public class Sysuserinfotomenu {
    private Integer id;

    private String accountnumber;

    private String menuauthority;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber == null ? null : accountnumber.trim();
    }

    public String getMenuauthority() {
        return menuauthority;
    }

    public void setMenuauthority(String menuauthority) {
        this.menuauthority = menuauthority == null ? null : menuauthority.trim();
    }
}