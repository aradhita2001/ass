package com.example.user.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
    public static int userCount = 5;
    private static List<User> userList = new ArrayList<User>();

    static{
        userList.add(new User(1, "safef", new Date()));
        userList.add(new User(2, "fefas", new Date()));
        userList.add(new User(3, "cccfef", new Date()));
        userList.add(new User(4, "feerf", new Date()));
        userList.add(new User(5, "fefvc", new Date()));
    }

    @Override
    public List<User> findAll() {
        return userList;
    }
    @Override
    public User save(User user) {
        if(user.getId() == null){
            user.setId(++userCount);
        }
        userList.add(user);
        return user;
    }
    @Override
    public User findOne(int id) {

        for(User user : userList){
            if(user.getId() == id) return user;
        }

        return null;
    } 

    

}
