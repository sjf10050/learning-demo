package com.unicom.senderrabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String message) {
        String messageContext = "hello:" + message + " " + new Date();
        this.rabbitTemplate.convertAndSend("hello", messageContext);
    }

}