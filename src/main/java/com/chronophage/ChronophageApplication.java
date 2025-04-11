package com.chronophage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class ChronophageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChronophageApplication.class, args);
	}

    @Bean
    public RestClient restClient(@Value("${remote.store.url}") String remoteUrl) {
        return RestClient.builder().baseUrl(remoteUrl).build();
    }
}
