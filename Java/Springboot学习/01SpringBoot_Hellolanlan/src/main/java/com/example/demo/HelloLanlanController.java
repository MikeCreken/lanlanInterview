package com.example.demo;/**
 * @ProjectName: SpringBoot_Hellolanlan
 * @Package: com.example.demo
 * @ClassName: HelloLanlanController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/11/14 22:08
 * @Version: 1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @ClassName HelloLanlanController
 * @Description TODO
 * @Author Administrator
 * @Date 2021/11/14 22:08
 * @Version 1.0
 */
//表示restful风格的控制器 返回 json/xml
@RestController
public class HelloLanlanController {
    //配置URL和方法的映射
    @RequestMapping("hello")
    public String Hello(){
        return "hello lanlan";
    }
}
