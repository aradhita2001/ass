package com.example.onlineshoppingsimple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineshoppingsimple.entity.Product;
import com.example.onlineshoppingsimple.service.ShoppingService;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
    @Autowired
    private ShoppingService shoppingService;

    @GetMapping
    public List<Product> getProduct() {
        return shoppingService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return shoppingService.getProductById(id);
    }

    @PostMapping("")
    public Product addProduct(@RequestBody Product product) {
        return shoppingService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return shoppingService.updateProductById(id, product);
    }

    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable int id) {
        return shoppingService.deleteProductById(id);
    }
}