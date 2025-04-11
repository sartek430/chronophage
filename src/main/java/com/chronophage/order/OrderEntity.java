package com.chronophage.order;

import com.chronophage.orderItem.OrderItemEntity;
import com.chronophage.product.ProductEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue
    private Long id;
    private boolean ispaid;
    @OneToMany
    private List<OrderItemEntity> products;

    public OrderEntity(boolean ispaid) {
        this.ispaid = ispaid;
    }

    public OrderEntity() {}

    public boolean isIspaid() {
        return ispaid;
    }

    public void setIspaid(boolean ispaid) {
        this.ispaid = ispaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
