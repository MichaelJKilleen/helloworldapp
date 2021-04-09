package com.bottomfeeder.helloui.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("hello-world")
public class HelloWorldController {

    public static final String FOO_RESOURCE_URL = "http://localhost:8082/rest/service/greeting";

    public static final String CLASSIC_MODELS_RESOURCE_URL = "http://localhost:8082/classicmodels/customer";

    @RequestMapping(value = "/index")
    public String index(Model model) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response
                = restTemplate.getForEntity(CLASSIC_MODELS_RESOURCE_URL, String.class);

        model.addAttribute("greeting", response.getBody());

        return "index";
    }

    @RequestMapping(value = "/greeting")
    public String greeting(Model model) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response
                = restTemplate.getForEntity(FOO_RESOURCE_URL, String.class);

        model.addAttribute("greeting", response.getBody());

        return "index";
    }

}
