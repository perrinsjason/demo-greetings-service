package com.perrinsjason.demo.greetingservice.controller;


import com.perrinsjason.demo.greetingservice.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class RSocketGreetingsController {

    private final GreetingService greetingService;

    @MessageMapping("string")
    public String StringGreeting(String name){
        return greetingService.StringGreeting(name);
    }

    @MessageMapping("mono")
    public Mono<String> MonoGreeting(String name) {
        return greetingService.MonoGreeting(name);
    }

    @MessageMapping("flux")
    public Flux<String> randomGreetingsGenerator(){
        return greetingService.randomGreetingsGenerator();
    }

}
