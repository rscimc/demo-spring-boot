package com.inicio.demo.controller;

//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.inicio.demo.entities.Department;
import com.inicio.demo.entities.Product;
import com.inicio.demo.repositories.ProductRepository;

@RestController
@RequestMapping(value="/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getObjects() {
        /*Hard Code
        Department d1 = new Department(1L, "Tech");
        Department d2 = new Department(2L, "Pet");
       
        Product p1 = new Product(1L, "Macbook Pro", 4000.00, d1);
        Product p2 = new Product(2L, "PC Gamer", 5000.00, d1);
        Product p3 = new Product(3L, "Pet House", 300.00, d2);
        List <Product> list = Arrays.asList();
        */
        List <Product> list = productRepository.findAll();

        return list;
    }
}