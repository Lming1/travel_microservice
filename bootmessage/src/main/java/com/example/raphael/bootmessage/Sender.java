package com.example.raphael.bootmessage;


import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;


@Component
public class Sender {
    @Autowired
    RabbitMessagingTemplate template;

    @Bean
    Queue queue() {
        return new Queue("TestQueue", false);
    }

    public void send(String message) {
        template.convertAndSend("TestQueue", message);
    }
}
