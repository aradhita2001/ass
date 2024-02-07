package com.example.onlineshoppingplatform.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.onlineshoppingplatform.entity.User;
import com.example.onlineshoppingplatform.exception.NotEnoughProductInStockException;
import com.example.onlineshoppingplatform.exception.WrongPasswordException;

@Service
public class UserService {

    private static List<User> users = new ArrayList<User>();
    
    public void updatePassword(String username, String oldPassword, String newPassword) throws WrongPasswordException{
        for(User user : users){
            if(user.getUserName().equals(username)){
                if(user.getPassword().equals(oldPassword)) user.setPassword(newPassword);
                else throw new WrongPasswordException();
            }
        }
    }

    public void buyCart(String username, String password) throws WrongPasswordException, NotEnoughProductInStockException{
        for(User user : users){
            if(user.getUserName().equals(username)){
                if(user.getPassword().equals(password)){
                    user.purchase();
                } 
                else throw new WrongPasswordException();
            }
        }
    }
}
