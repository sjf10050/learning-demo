package com.unicom.databasedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlarmController {
    @RequestMapping("alarm")
    public void alarmListener(Object o) {
        System.out.println(o.toString());
    }
}
