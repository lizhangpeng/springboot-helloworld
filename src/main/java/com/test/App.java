package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

import com.test.controller.HelloController;
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.test","com.test.log"})
@MapperScan(basePackages = "com.test.dao")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}
