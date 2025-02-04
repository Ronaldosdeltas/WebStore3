package com.api.WebStore3.controllers;

import com.api.WebStore3.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @GetMapping({"", "/"})
    public String listProducts(Model model) {
        model.addAttribute("products", repo.findAll());
        return "products/index";
    }
}
