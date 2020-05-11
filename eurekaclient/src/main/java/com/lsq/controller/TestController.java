package com.lsq.controller;

import com.lsq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;
    @Value("${server.port}")
    private String port;
    @GetMapping("/getId")
    public int getId(){
        return testService.getId();
    }
    @GetMapping("/index")
    public String index(){
        return "当前端口："+port;
    }
}
