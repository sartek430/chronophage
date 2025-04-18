package com.chronophage.product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductDTO {
    private Long id;

    @NotBlank(message = "Product name cannot be empty")
    private String productName;

    @Min(value = 1, message = "Quantity must be at least 1")
    private Long quantity;

    public ProductDTO(Long id, String productName, Long quantity) {
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
