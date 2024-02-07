package com.example.onlineshoppingsimple.service;

import java.util.List;

import com.example.onlineshoppingsimple.entity.Product;
import com.example.onlineshoppingsimple.entity.User;

public interface ShoppingService {
    public Product addProduct(Product product);

    public List<Product> getAllProduct();

    public Product getProductById(int productId);

    public Product updateProductById(int productId, Product product);

    public Product deleteProductById(int productId);

    public User userRegistration(User user);

    public List<User> getAllUser();
}
