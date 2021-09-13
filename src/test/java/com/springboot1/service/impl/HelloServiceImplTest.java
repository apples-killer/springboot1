package com.springboot1.service.impl;

import com.springboot1.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class HelloServiceImplTest {

    @Resource
    private HelloService helloService;
    @Test
    public void helloService() {
        helloService.helloService();
    }
}