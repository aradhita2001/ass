package com.example.helloworld.entity;

public class HelloWorldBean {
    private String message11;

    public HelloWorldBean(String message11) {
        this.message11 = message11;
    }

    public String getMessage11() {
        return message11;
    }

    public void setMessage11(String message11) {
        this.message11 = message11;
    }

    @Override
    public String toString() {
        return "HelloWorldBean [message11=" + message11 + "]";
    }
}
