package com.perrinsjason.demo.greetingservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {



    @GetMapping("/")
    public String helloWorld( @Value("${application.version}") String appVersion){
        return "Hello World! "+appVersion;
    }
}
