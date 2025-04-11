package com.chronophage.product;

import java.util.ArrayList;
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

    public List<ProductDTO> saveAll(List<ProductDTO> products) {
        List<ProductEntity> productEntities = new ArrayList<ProductEntity>();

        for (ProductDTO postProductDTO : products) {
            ProductEntity productEntity = new ProductEntity(
                postProductDTO.getProductName(), 
                postProductDTO.getQuantity(), 
                null
            );

            productEntities.add(productEntity);
        }

        repository.saveAll(productEntities);
        return products;
    }
}
