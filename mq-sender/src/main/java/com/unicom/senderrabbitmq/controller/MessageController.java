package com.unicom.senderrabbitmq.controller;

import com.unicom.senderrabbitmq.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private HelloSender helloSender;

    @GetMapping("send")
    public String sendMessage(@RequestParam String message) {
        helloSender.send(message);
        return "OK";
    }
    @GetMapping("sendmore")
    public String sendMessageMulti(@RequestParam String message,@RequestParam int num) {
        for(int i=0;i<num;i++){
            helloSender.send(""+i+message);
        }
        return "OK";
    }
}
