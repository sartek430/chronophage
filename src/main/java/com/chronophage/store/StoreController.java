package com.chronophage.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired StoreService storeService;

    @PostMapping("/register")
    public StoreDTO registerStore(@RequestBody StoreDTO store) {
        return storeService.registerStore(store);
    }
}
