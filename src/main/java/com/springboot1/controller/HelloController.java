package com.springboot1.controller;

import com.springboot1.dto.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Value("${name}")
    private String testName;

    @Value("${person.name}")
    private String personName;

    @Value("${cities[0]}")
    private String city1;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    @Value("${msg3}")
    private String msg3;

    @Resource
    private Environment env;

    @Resource
    private Person person;


    @RequestMapping("/hello")
    public String hello() {
        System.out.println(env.getProperty("cities[0]"));
        System.out.println(person);
        return personName + "Hello Spring Boot!" + testName+","+city1+","+msg1+","+msg2+","+msg3;
    }
}
