package com.chronophage.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ProductEntity {

    @Id @GeneratedValue
    private Long id;

    @NotBlank(message = "Product name cannot be empty")
    private String name;

    @Min(value = 1, message = "Quantity must be at least 1")
    private Long quantity;

    @Min(value = 0, message = "Price must be positive")
    private Double price;

    public ProductEntity() {}
    
    public ProductEntity(String name, Long quantity, Double price) {
        super();
        this.name = name;
        this.quantity = quantity;
        this.price = price;
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
