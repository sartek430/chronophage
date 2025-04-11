package com.chronophage.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductStockService {
    
    @Autowired ProductStockRepository repository;

    public List<ProductStockEntity> getAll() {
        return repository.findAll();
    }

    public void saveAll(List<ProductStockEntity> entities) {
        repository.saveAll(entities);
    }
}
