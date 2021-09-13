package com.springboot1.service.impl;

import com.springboot1.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public void helloService() {
        System.out.println("call helloService method !");
    }
}
