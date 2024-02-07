package com.example.user.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date dob;
    public User() {
    }
    public User(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.dob = date;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    
}
