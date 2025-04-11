package com.chronophage.product;

import jakarta.persistence.*;

@Entity
public class ProductEntity {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private Long quantity;
    private Double price;
    
    public ProductEntity(String name, Long quantity, Double price) {
        super();
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public ProductEntity() {

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
