package com.javasm.productManager.entity;

public class GongYingShangInfo {
    private Integer gid;

    private String gname;

    private String glinkman;

    private String gphone;

    private String gadress;

    private String gaccount;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGlinkman() {
        return glinkman;
    }

    public void setGlinkman(String glinkman) {
        this.glinkman = glinkman == null ? null : glinkman.trim();
    }

    public String getGphone() {
        return gphone;
    }

    public void setGphone(String gphone) {
        this.gphone = gphone == null ? null : gphone.trim();
    }

    public String getGadress() {
        return gadress;
    }

    public void setGadress(String gadress) {
        this.gadress = gadress == null ? null : gadress.trim();
    }

    public String getGaccount() {
        return gaccount;
    }

    public void setGaccount(String gaccount) {
        this.gaccount = gaccount == null ? null : gaccount.trim();
    }
}