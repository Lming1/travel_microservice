package com.example.raphael.bootsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;



// EnableResourceServer, EnableAuthorizationServer 는 지금 예제에만 같이 사용..
@EnableResourceServer
@EnableAuthorizationServer
@SpringBootApplication
public class BootsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootsecurityApplication.class, args);
    }

}

