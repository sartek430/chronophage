package com.chronophage.stock;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ProductStockEntity {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private Long quantity;

    public ProductStockEntity() {}
    
    public ProductStockEntity(Long id, String name, Long quantity) {
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return quantity;
    }
}
