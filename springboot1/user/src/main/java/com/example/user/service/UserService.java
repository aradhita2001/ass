package com.example.user.service;

import java.util.List;

import com.example.user.entity.User;

public interface UserService {
    public List<User> findAll();
    public User save (User user);
    public User findOne(int id);
}
