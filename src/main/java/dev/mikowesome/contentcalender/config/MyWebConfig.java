package dev.mikowesome.contentcalender.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class MyWebConfig {
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }
}
