package com.example.raphael.bootmessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootmessageApplication implements CommandLineRunner {

    @Autowired
    Sender sender;

    public static void main(String[] args) {
        SpringApplication.run(BootmessageApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sender.send("Welcome Message!");
    }
}

