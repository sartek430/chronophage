package com.chronophage.price;

import jakarta.validation.constraints.Min;

public class PriceDTO {
    @Min(value =0, message = "Product id cannot be empty ")
    private Long productId;
    @Min(value = 0, message = "Amount cannot be empty")
    private Double amount;

    public PriceDTO(Long productId, Double amount) {
        this.productId = productId;
        this.amount = amount;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
