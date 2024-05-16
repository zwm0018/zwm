package com.javaproject.demo.controller;

import com.javaproject.demo.domain.Test;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaproject.demo.service.TestService;

import java.util.List;

@RestController
public class TestController {


    @Value("${test.hello:TEST1}")
    private String testHello;

    @Resource
    private TestService testService;

    /**
     *
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post, " + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
