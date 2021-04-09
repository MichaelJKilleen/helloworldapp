package com.bottomfeeder.services.controller;

import com.bottomfeeder.services.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("classicmodels")
public class CustomerController {

    @Value("${persist.host:default_value}")
    private String persistHost;

    public CustomerController() {
    }

    @GetMapping("customer")
    public ResponseEntity<List<Customer>> get() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Customer[]> response
                = restTemplate.getForEntity(persistHost + "/customer", Customer[].class);
        List<Customer> customers = Arrays.asList(response.getBody());
        return ResponseEntity.ok(customers);
    }
}
