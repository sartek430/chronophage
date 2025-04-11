package com.chronophage.product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class PostProductDTO {
    private Long id;
    
    @NotBlank(message = "The product name cannot be empty")
    private String productName;

    @Min(value = 1, message = "The quantity must be at least 1")
    private Long quantity;

    public PostProductDTO(Long id, String productName, Long quantity) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
