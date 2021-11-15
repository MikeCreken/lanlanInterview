package com.example.demo;/**
 * @ProjectName: 02SpringBoot_Properties
 * @Package: com.example.demo
 * @ClassName: properTest
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/11/15 21:27
 * @Version: 1.0
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类描述：
 *
 * @ClassName properTest
 * @Description TODO
 * @Author Administrator
 * @Date 2021/11/15 21:27
 * @Version 1.0
 */
@Component
@ConfigurationProperties(prefix="personinfo")
public class properTest {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
