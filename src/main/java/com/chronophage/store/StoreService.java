package com.chronophage.store;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service
public class StoreService {
    private final RestTemplate restTemplate;

    @Value("${remote.store.url}")
    private String remoteUrl;

    public StoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public StoreDTO registerStore(StoreDTO store) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<StoreDTO> request = new HttpEntity<>(store, headers);
        ResponseEntity<StoreDTO> response = restTemplate.exchange(remoteUrl, HttpMethod.POST, request, StoreDTO.class);

        return response.getBody();
    }
}
