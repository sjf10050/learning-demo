package com.unicom.mqreceiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {
    private int count;
    @RabbitHandler
    public void process(String message) {
        System.out.println("Receiver:" + message);
        count++;
    }

}