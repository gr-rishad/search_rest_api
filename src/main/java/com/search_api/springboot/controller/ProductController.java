package com.search_api.springboot.controller;

import com.search_api.springboot.entity.Product;
import com.search_api.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public Product createProduct(@RequestBody  Product product){
        return productService.createProduct(product);
    }

    @PostMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query) {
        return ResponseEntity.ok(productService.searchProducts(query));
    }
}
