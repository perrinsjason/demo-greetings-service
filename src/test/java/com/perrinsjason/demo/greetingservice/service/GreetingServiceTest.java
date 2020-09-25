package com.perrinsjason.demo.greetingservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreetingServiceTest {

    private GreetingService greetingService;

    @BeforeEach
    void beforeEach() {
        greetingService = new GreetingService();
    }


    @Test
    public void testStringGreeting(){
        assertEquals("Hello Jason",greetingService.StringGreeting("Jason"));
    }

    @Test
    public void testMonoGreeting(){
        assertEquals("Hello mono",greetingService.MonoGreeting("mono").block());
    }

    @Test
    public void testRandomFluxGreeting(){

        Flux<String> stream = greetingService.randomGreetingsGenerator();

        StepVerifier.create(stream).assertNext( greeting -> {
            assertTrue(greeting !=null);
            assertTrue(greeting.contains("Hello"));
        });
    }

}