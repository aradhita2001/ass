package com.example.onlineshoppingplatform.entity;

import java.util.HashMap;
import java.util.Map;

import com.example.onlineshoppingplatform.exception.NotEnoughProductInStockException;
import com.example.onlineshoppingplatform.service.ProductService;

public class Cart {
    private Map<Integer, Integer> productMap;

    public Cart(){
        productMap = new HashMap<Integer, Integer>();
    }

    public void clear(){
        productMap.clear();
    }

    public void addProduct(Product product){
        productMap.put(product.getProductId(), 1);
    }

    public void removeProduct(Product product) {
        productMap.remove(product.getProductId());
    }

    public void updateQuantity(Product product, int quantity){
        productMap.put(product.getProductId(), quantity);
    }

    public double buy() throws NotEnoughProductInStockException{
        double totalCost = 0;
        for(int productId : productMap.keySet()){
            totalCost += ProductService.sellProduct(productId, productMap.get(productId));
        }

        return totalCost;
    }
}
