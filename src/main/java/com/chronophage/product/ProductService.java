package com.chronophage.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<ProductDTO> getAll() {
        List<ProductEntity> productEntities = repository.findAll();
        List<ProductDTO> products = new ArrayList<>();

        for (ProductEntity productEntity : productEntities) {
            ProductDTO productDTO = new ProductDTO(
                    productEntity.getId(),
                    productEntity.getName(),
                    productEntity.getQuantity()
            );
            products.add(productDTO);
        }
        return products;
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
