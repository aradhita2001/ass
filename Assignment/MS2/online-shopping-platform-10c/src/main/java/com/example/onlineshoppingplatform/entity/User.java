package com.example.onlineshoppingplatform.entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.onlineshoppingplatform.exception.NotEnoughProductInStockException;

public class User {
    private String userName;
    private String password;
    @Autowired
    private Cart cart;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void purchase() throws NotEnoughProductInStockException{
        cart.buy();
        cart.clear();
    }
}