package com.unicom.demopostgresql.service.impl;

import com.unicom.demopostgresql.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void testLombok() {
        log.info("自动加载Logger成功");
    }
}
