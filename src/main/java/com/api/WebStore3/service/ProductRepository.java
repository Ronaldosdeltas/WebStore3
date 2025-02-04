package com.api.WebStore3.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.WebStore3.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
