package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

	//获取配置文件中的age
	@Value("${age}")
	private int age;

	//获取配置文件中的name
	@Value("${name}")
	private String name;

	@Test
	public void getAge(){
		System.out.println(age);
	}

	@Test
	public  void getName(){
		System.out.println(name);
	}

	@Autowired
    private properTest getProperTest;

	@Test
    public  void getpersonalproperties(){
        System.out.println(getProperTest.getAge()+getProperTest.getName());
    }
}
