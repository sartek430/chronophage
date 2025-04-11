package com.chronophage.order;

import com.chronophage.product.ProductEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    private boolean ispaid;
    @OneToMany
    private List<ProductEntity> products;

    public Order(boolean ispaid) {
        this.ispaid = ispaid;
    }

    public Order() {}

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
