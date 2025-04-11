package com.chronophage.product;

public class PostProductDTO {
    private Long id;
    private String productName;
    private int quantity;

    public PostProductDTO(Long id, String productName, int quantity) {
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
    public long getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
