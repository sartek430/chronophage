package com.chronophage.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class StoreService {
    @Autowired RestClient restClient;

    @Value("${spring.application.name}") String name;
    @Value("${spring.application.baseurl}") String baseUrl;

    // @PostConstruct
    // public void init() {
    //     StoreDTO store = new StoreDTO(name, baseUrl);
    //     registerStore(store);
    // }

    public StoreDTO registerStore(StoreDTO store) {
        return restClient.post()
            .body(store)
            .retrieve()
            .toEntity(StoreDTO.class)
            .getBody();
    }
}
