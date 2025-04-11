package com.chronophage;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.chronophage.price.PriceDTO;
import com.chronophage.price.PriceService;
import com.chronophage.product.ProductEntity;
import com.chronophage.product.ProductRepository;

@ExtendWith(MockitoExtension.class)
public class PriceServiceTest {

    @Mock ProductRepository productRepository;
    @InjectMocks PriceService priceService;

    private List<ProductEntity> products;

    @BeforeEach
    public void setup() {
        products = Arrays.asList(
            new ProductEntity("potatoes", 1000L, 0.35),
            new ProductEntity("tomatoes", 500L, 0.75)
        );
    }

    @Test
    public void testGetPrices() {
        when(productRepository.findAll()).thenReturn(products);

        List<PriceDTO> result = priceService.getPrices();

        assertEquals(2, result.size());
        assertEquals(0.35, result.get(0).getAmount());
        assertEquals(0.75, result.get(1).getAmount());

        verify(productRepository, times(1)).findAll();
    }
}
