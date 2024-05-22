package com.javaproject.demo.controller;

import com.javaproject.demo.domain.Ebook;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaproject.demo.service.EbookService;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {


    @Value("${Ebook.hello:Ebook1}")
    private String EbookHello;

    @Resource
    private EbookService EbookService;

    /**
     *
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + EbookHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post, " + name;
    }

    @GetMapping("/list")
    public List<Ebook> list() {
        return EbookService.list();
    }
}
