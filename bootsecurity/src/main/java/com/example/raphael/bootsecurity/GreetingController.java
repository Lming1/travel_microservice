package com.example.raphael.bootsecurity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @CrossOrigin
    @GetMapping("/")
    Greet greet(){
        return new Greet("Hello World!");
    }
}
