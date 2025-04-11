package com.chronophage.price;

import com.chronophage.product.ProductEntity;
import com.chronophage.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PriceService {
    @Autowired
    private ProductRepository productRepository;

    public List<PriceDTO> getPrices(){
        List<ProductEntity> productEntities = productRepository.findAll();
        List<PriceDTO> prices = new ArrayList<>();

        for (ProductEntity productEntity : productEntities) {
            PriceDTO priceDTO = new PriceDTO(
                    productEntity.getId(),
                    productEntity.getPrice()
            );
            prices.add(priceDTO);
        }
        return prices;
    }

    public List<PriceDTO> saveAll(List<PriceDTO> prices) {
        Map<Long, Double> priceMap = prices.stream()
                .collect(Collectors.toMap(PriceDTO::getProductId, PriceDTO::getAmount));

        List<ProductEntity> productEntities = productRepository.findAllById(priceMap.keySet());

        for (ProductEntity product : productEntities) {
            Double newPrice = priceMap.get(product.getId());
            if (newPrice != null) {
                product.setPrice(newPrice);
            }
        }
        productRepository.saveAll(productEntities);

        return prices;
    }
}
