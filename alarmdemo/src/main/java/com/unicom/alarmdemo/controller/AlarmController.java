package com.unicom.alarmdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlarmController {
    @RequestMapping("alarm")
    public void alarmListener(Object o) {
        System.out.println("收到报警");
        System.out.println(o.toString());
    }
}
