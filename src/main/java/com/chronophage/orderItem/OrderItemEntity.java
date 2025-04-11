package com.chronophage.orderItem;

import com.chronophage.product.ProductEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class OrderItemEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Long quantity;
    @OneToOne
    private ProductEntity product;

    public OrderItemEntity(Long quantity) {
        this.quantity = quantity;
    }

    public OrderItemEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
