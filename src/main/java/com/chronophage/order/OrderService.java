package com.chronophage.order;

import com.chronophage.orderItem.OrderItemDTO;
import com.chronophage.product.ProductDTO;
import com.chronophage.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductService productService;

    public OrderItemDTO save(OrderItemDTO orderItem) {

    }
}
