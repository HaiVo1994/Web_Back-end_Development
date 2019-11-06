package com.productManage.service;

import com.productManage.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products = new HashMap<>();
    static {
        products.put(1, new Product(1, "Apple", 12, "red", "vn"));
        products.put(2, new Product(2, "Pineapple", 10, "yellow", "vn"));
        products.put(3, new Product(3, "Peach", 15, "pink", "vn"));
        products.put(4, new Product(4, "Kiwi", 30, "green", "vn"));
        products.put(5, new Product(5, "Banana", 11, "yellow", "vn"));
        products.put(6, new Product(6, "Mango", 24, "red", "vn"));
        products.put(7, new Product(7, "Blueberry", 30, "blue", "vn"));
    }
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public Product getById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        for (Product value : products.values()){
            if (value.getName().contains(name)){
                return value;
            }
        }
        return null;
    }
}
