package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * mvc模式的控制器
 */
@Controller
public class HelloMvcController {
    @RequestMapping("/helloworld")
    public String helloWorld(Model model) throws Exception {
        model.addAttribute("mav","HelloWorldController,xiaolan Spring boot!");
       // model.addAttribute("mav", "HelloWorldController ,Spring Boot!");
//视图(view)的位置和名称，视图位于example文件夹下，视图文件为hello.html。
        return "example/hello";
    }
}
