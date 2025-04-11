package com.chronophage.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/store")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/stock")
    public List<ProductDTO> getProducts() {
        return this.productService.getAll();
    }

    @PostMapping("/stock")
    public List<ProductDTO> addStock(@RequestBody List<ProductDTO> products) {
        return this.productService.saveAll(products);
    }
}
