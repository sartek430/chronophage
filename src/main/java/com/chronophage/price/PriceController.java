package com.chronophage.price;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/store")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping("/price")
    public List<PriceDTO> getprices() {
        return priceService.getPrices();
    }

    @PostMapping("/price")
    public List<PriceDTO> addPrices(@Valid @RequestBody List<PriceDTO> prices) {
        return priceService.saveAll(prices);
    }
}
