package com.nf147_bookstore_ssm.entity;

import java.util.Date;

public class BookLog {
    private int logid;
    private String msg;
    private Date creTime;

    public BookLog() {
    }

    public BookLog(int logid, String msg, Date creTime) {
        this.logid = logid;
        this.msg = msg;
        this.creTime = creTime;
    }

    public BookLog(String msg) {
        this.msg = msg;
    }

    public int getBookid() {
        return logid;
    }

    public String getMsg() {
        return msg;
    }

    public Date getCreTime() {
        return creTime;
    }

    public void setBookid(int logid) {
        this.logid = logid;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCreTime(Date creTime) {
        this.creTime = creTime;
    }
}
