package com.chronophage.order;

import com.chronophage.orderItem.OrderItemDTO;

import java.util.List;

public class OrderDTO {
    private Long id;
    private List<OrderItemDTO> orderItems;

    public OrderDTO() {}
    public OrderDTO(Long id, List<OrderItemDTO> orderItems) {
        this.id = id;
        this.orderItems = orderItems;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<OrderItemDTO> getProducts() {
        return orderItems;
    }
    public void setProducts(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
