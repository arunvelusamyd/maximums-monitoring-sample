package com.flexy.gateway;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flexy.dto.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class ProductGateway {

    @Autowired
    private RestTemplate restTemplate;

    public Map<String, List<Product>> getProducts() throws JsonProcessingException {
        String responseStr
                = restTemplate.getForObject("http://localhost:8081/products", String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<Map<String, List<Product>>> typeRef
                = new TypeReference<Map<String, List<Product>>>() {};
        Map<String, List<Product>> productData = objectMapper.readValue(responseStr, Map.class);
        return productData;
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
