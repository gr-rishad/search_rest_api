package com.search_api.springboot.service;

import com.search_api.springboot.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
