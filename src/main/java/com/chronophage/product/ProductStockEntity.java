package com.chronophage.product;

import jakarta.persistence.*;

@Entity
public class ProductStockEntity {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private Long quantity;
    private double price;
    
    public ProductStockEntity(String name, Long quantity, double price) {
        super();
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public ProductStockEntity() {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
