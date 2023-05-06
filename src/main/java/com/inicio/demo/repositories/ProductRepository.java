package com.inicio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inicio.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}