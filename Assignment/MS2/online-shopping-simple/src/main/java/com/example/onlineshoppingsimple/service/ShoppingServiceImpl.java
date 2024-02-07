package com.example.onlineshoppingsimple.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.onlineshoppingsimple.entity.Product;
import com.example.onlineshoppingsimple.entity.User;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    private static List<Product> productsList = new ArrayList<>();
    private static List<User> usersList = new ArrayList<>();

    @Override
    public List<Product> getAllProduct() {
        return productsList;
    }

    @Override
    public Product getProductById(int productId) {
        for (Product p : productsList) {
            if (p.getProductId() == productId) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Product updateProductById(int productId, Product product) {
        for (Product p : productsList) {
            if (p.getProductId() == productId) {
                p.setProductName(product.getProductName());
                p.setPrice(product.getPrice());
                p.setQuantityInStock(product.getQuantityInStock());
                return p;
            }
        }
        return product;
    }

    @Override
    public Product deleteProductById(int productId) {
        for (Product p : productsList) {
            if (p.getProductId() == productId) {
                productsList.remove(p);
                return p;
            }
        }
        return null;
    }

    @Override
    public User userRegistration(User user) {
        usersList.add(user);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return usersList;
    }

    @Override
    public Product addProduct(Product product) {
        productsList.add(product);
        return product;
    }
}
