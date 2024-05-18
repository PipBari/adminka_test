package com.example.adminka.controller;

import com.example.adminka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getUser(Model model) {
        User user = new User(1L, "Alice", "alice@xto.com", productService.getAllProducts());
        User user1 = new User(2L, "Robert", "test@test.com", productService.getAllProducts());
        model.addAttribute("user", user);
        model.addAttribute("user1", user1);
        return "users";
    }
}
