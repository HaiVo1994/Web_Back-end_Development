package com.productManage.service;

import com.productManage.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    void create (Product product);
    void update (int id, Product product);
    void delete (int id);
    Product getById(int id);
    Product findByName(String name);
}
