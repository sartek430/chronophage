package com.chronophage.store;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/register")
    public StoreDTO registerStore(@RequestBody StoreDTO store) {
        return storeService.registerStore(store);
    }
}
