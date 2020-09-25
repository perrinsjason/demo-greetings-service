package com.perrinsjason.demo.greetingservice.controller;

import com.perrinsjason.demo.greetingservice.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/greeting/")
@RequiredArgsConstructor
public class RestGreetingsController {

    private final GreetingService greetingService;

    @GetMapping(path ="string/{name}")
    public String StringGreeting(@PathVariable("name") String name){
        return greetingService.StringGreeting(name);
    }

    @GetMapping(path ="mono/{name}")
    public Mono<String> MonoGreeting(@PathVariable("name")String name) {
        return greetingService.MonoGreeting(name);
    }

    @GetMapping(path = "flux")
    public Flux<String> randomGreetingsGenerator(){
        return greetingService.randomGreetingsGenerator();
    }
}
