package com.example.onlineshoppingplatform.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.onlineshoppingplatform.entity.Product;
import com.example.onlineshoppingplatform.exception.NotEnoughProductInStockException;

@Service
public class ProductService {

    private static List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        for(Product p : products){
            if(product.getProductId().equals(p.getProductId())) {
                p.setPrice(product.getPrice());
                p.setProductName(product.getProductName());
                p.setQuantityInStock(p.getQuantityInStock());
            }
        }
    }

    public void deleteProduct(int productId) {
        for(Product p : products){
            if(p.getProductId().equals(productId)) {
                products.remove(p);
            }
        }
    }

    public static double sellProduct(int productId, int quantity) throws NotEnoughProductInStockException{
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                product.setQuantityInStock(product.getQuantityInStock() - quantity);
                return product.getPrice() * quantity;
            }
            else{
                throw new NotEnoughProductInStockException();
            }
        }
        return 0.0;
    }
}
