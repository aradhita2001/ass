package com.example.flight.entity;

public class User {
    private String name;
    private long flightNo;
    public User() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(long flightNo) {
        this.flightNo = flightNo;
    }

    public User(String name, long flightNo) {
        this.name = name;
        this.flightNo = flightNo;
    }
    
}
