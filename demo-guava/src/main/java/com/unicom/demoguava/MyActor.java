package com.unicom.demoguava;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class MyActor {
    @PostConstruct
    private void init() {
        log.info("初始化");
        System.out.println("初始化");
    }

    @PreDestroy
    private void destroy() {
        log.info("销毁中");
        System.out.println("销毁中");

    }

    public void execute(String s) {
        log.info("收到：" + s);
        System.out.println("收到：" + s);
    }
}
