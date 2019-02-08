package com.example.raphael.bootactuator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

    TPSHealth health;

    @CrossOrigin
    @GetMapping("/")
    Greet greet(){
        return new Greet("Hello World!");
    }
}
