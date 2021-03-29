package com.bottomfeeder.services.controller;

import com.bottomfeeder.services.model.BillionareDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("classicmodels")
public class CustomerController {



    @GetMapping("customer")
    public String get() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response
                = restTemplate.getForEntity("http://localhost:8083/classicmodelspersist/customer", String.class);

        return "";
    }
}
