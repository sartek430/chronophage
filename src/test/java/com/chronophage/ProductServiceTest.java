package com.chronophage;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import com.chronophage.product.ProductDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.chronophage.product.ProductEntity;
import com.chronophage.product.ProductRepository;
import com.chronophage.product.ProductService;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    
    @Mock ProductRepository repository;
    @InjectMocks ProductService service;

    private List<ProductEntity> products;

    @BeforeEach
    public void setup() {
        products = Arrays.asList(
            new ProductEntity("potatoes", 1000L, 0.35),
            new ProductEntity("tomatoes", 500L, 0.75)
        );
    }

    @Test
    public void testGetAll() {
        when(repository.findAll()).thenReturn(products);
        List<ProductDTO> result = service.getAll();

        assertEquals(2, result.size());
        assertEquals("potatoes", result.get(0).getProductName());
        
        verify(repository, times(1)).findAll();
    }
}