package com.chronophage.price;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
public class PriceEntity {

    @Id
    @GeneratedValue
    private Long id;
    private float amount;
    @OneToMany(cascade ={CascadeType.ALL})
    private List<Object> products;

    public PriceEntity(float amount) {
        this.amount = amount;
    }

    public PriceEntity() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
