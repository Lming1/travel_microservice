package com.example.raphael.webfluxtest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetController {
    @RequestMapping("/")
    Mono<Greet> greet() {
        return Mono.just(new Greet("Hello World"));
    }
}
