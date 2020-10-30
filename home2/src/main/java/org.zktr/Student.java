package org.zktr;

import java.util.Date;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private String phone;
    private Date date;
    private Map<Integer,String> love;

    public Student() {
    }

    public Student(int id, String name, String phone, Date date) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<Integer, String> getLove() {
        return love;
    }

    public void setLove(Map<Integer, String> love) {
        this.love = love;
    }
}
