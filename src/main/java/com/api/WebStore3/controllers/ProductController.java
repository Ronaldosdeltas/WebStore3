package com.api.WebStore3.controllers;

import com.api.WebStore3.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;
}
