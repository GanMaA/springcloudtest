package com.lsq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/getId")
    public int getId(){
        return restTemplate.getForObject("http://localhost:8010/test/getId",Integer.class);
    }
}
