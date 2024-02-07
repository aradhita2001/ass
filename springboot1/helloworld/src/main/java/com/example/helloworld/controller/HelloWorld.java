package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.entity.HelloWorldBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String hello() {
        return "Welcome to EBIL Java Spring boot project";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("hello world bean string");
    }

    @GetMapping("/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("%s", name));
    }
    
    @GetMapping("/add/{n1}/{n2}")
    public int helloWorldAddTwoInt(@PathVariable int n1, @PathVariable int n2) {
        return n1+n2;
    }
    
}
