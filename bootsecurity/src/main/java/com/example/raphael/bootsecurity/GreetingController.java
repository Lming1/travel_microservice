package com.example.raphael.bootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/")
    Greet greet(){
        return new Greet("Hello World!");
    }
}
