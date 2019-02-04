package com.example.raphael.bootmessage;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(queues = "TestQueue")
    public void processMessage(String content) {
        System.out.println(content);
    }
}
