package com.example.productservice.service;

import com.example.productservice.entity.Product;
import com.example.productservice.repository.ProdRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    @Autowired
    private ProdRepository prodRepository;

    public Product saveProduct(Product product){
        return prodRepository.save(product);
    }

    public Product findProductById(String productId){
        return prodRepository.findProductById(productId);
    }
}
