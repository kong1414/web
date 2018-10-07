package com.kongww.web.pojo.model;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 23:34 2018/10/7
 */
public class Student {

    private String snumber;

    private String sname;

    public Student(String snumber, String sname) {
        this.snumber = snumber;
        this.sname = sname;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
