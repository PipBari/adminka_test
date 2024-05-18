package com.example.adminka.controller;

import com.example.adminka.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product(1L, "Laptop", 999.99),
                new Product(2L, "Phone", 499.99)
        );
    }
}
