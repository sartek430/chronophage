package com.chronophage.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import jakarta.annotation.PostConstruct;

@Service
public class StoreService {
    @Autowired RestClient restClient;

    @Value("${remote.store.name}") String name;
    @Value("${remote.store.baseurl}") String baseUrl;

    @PostConstruct
    public void init() {
        StoreDTO store = new StoreDTO(name, baseUrl);
        registerStore(store);
    }

    public StoreDTO registerStore(StoreDTO store) {
        return restClient.post()
            .body(store)
            .retrieve()
            .toEntity(StoreDTO.class)
            .getBody();
    }
}
