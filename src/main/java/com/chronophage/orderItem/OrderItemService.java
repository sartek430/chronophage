package com.chronophage.orderItem;

import com.chronophage.product.ProductDTO;
import com.chronophage.product.ProductEntity;
import com.chronophage.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;
    @Autowired
    private ProductService productService;

    public List<OrderItemDTO> saveAll(List<OrderItemDTO> orderItems) {
        List<OrderItemEntity> orderItemsToSave = new ArrayList<>();

        for (OrderItemDTO orderItem : orderItems) {
            ProductDTO foundProduct = productService.getById(orderItem.getProductId());
            if(foundProduct.getQuantity() < orderItem.getQuantity()) {
                orderItem.setQuantity(foundProduct.getQuantity());
            }
            orderItemsToSave.add(convertToEntity(orderItem));
        }
        orderItemRepository.saveAll(orderItemsToSave);
        return orderItems;
    }

    private OrderItemEntity convertToEntity(OrderItemDTO orderItem) {
        OrderItemEntity orderItemEntity = new OrderItemEntity();
        orderItemEntity.setQuantity(orderItem.getQuantity());
        orderItemEntity.setProduct(convertProductToEntity(productService.getById(orderItem.getProductId())));
        return orderItemEntity;
    }

    private ProductEntity convertProductToEntity(ProductDTO product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setQuantity(product.getQuantity());
        productEntity.setId(product.getId());
        productEntity.setName(product.getProductName());
        productEntity.setPrice(null);
        return productEntity;
    }
}
