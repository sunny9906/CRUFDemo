package com.example.crud.service;

import com.example.crud.entity.Product;
import com.example.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
     @Autowired
    private ProductRepository Repository;

     public Product saveProduct(Product product) {
        return repository.save(product);
     }
}
