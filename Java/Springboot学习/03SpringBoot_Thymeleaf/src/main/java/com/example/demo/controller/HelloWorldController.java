package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello()  throws Exception{
        return "HelloWorld ,Spring Boot!";
    }
}
