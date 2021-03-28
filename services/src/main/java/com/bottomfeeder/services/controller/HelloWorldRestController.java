package com.bottomfeeder.services.controller;

import com.bottomfeeder.services.model.BillionareDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("rest/service")
public class HelloWorldRestController {

    @GetMapping( "greeting")
    public ResponseEntity<String> get() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<BillionareDTO[]> response
                = restTemplate.getForEntity("http://localhost:8083/persist/billionares", BillionareDTO[].class);

        BillionareDTO[] data = response.getBody();
        return ok(data[0].getFirstName());

    }
}
