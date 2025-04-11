package com.chronophage.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class StoreService {
    @Autowired RestClient restClient;

    public StoreDTO registerStore(StoreDTO store) {
        return restClient.post()
            .body(store)
            .retrieve()
            .toEntity(StoreDTO.class)
            .getBody();
    }
}
