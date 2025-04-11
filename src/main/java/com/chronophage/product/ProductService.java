package com.chronophage.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository repository;

    public List<ProductEntity> getAll() {
        return repository.findAll();
    }

    public List<ProductEntity> saveAll(List<ProductEntity> entities) {
        return repository.saveAll(entities);
    }
}
