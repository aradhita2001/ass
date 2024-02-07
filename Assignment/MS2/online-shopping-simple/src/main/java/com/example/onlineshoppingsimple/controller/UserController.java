package com.example.onlineshoppingsimple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineshoppingsimple.entity.User;
import com.example.onlineshoppingsimple.service.ShoppingService;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    
    @Autowired
    private ShoppingService shoppingService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return shoppingService.userRegistration(user);
    }

    @GetMapping
    public List<User> getAllUser() {
        return shoppingService.getAllUser();
    }
}
