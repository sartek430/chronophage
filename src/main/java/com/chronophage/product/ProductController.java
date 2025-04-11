package com.chronophage.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/store")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/stock")
    public List<ProductEntity> getProducts() {
        return this.productService.getAll();
    }

    @PostMapping("/stock")
    public List<PostProductDTO> addStock(@RequestBody List<PostProductDTO> products) {
        return this.productService.saveAll(products);
    }
}
