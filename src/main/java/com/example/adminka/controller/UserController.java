package com.example.adminka.controller;

import com.example.adminka.model.Product;
import com.example.adminka.model.User;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public User getUser() {
        List<Product> products = productService.getAllProducts();
        return new User(1L, "Alice", "alice@xto.com", products);
    }
}

