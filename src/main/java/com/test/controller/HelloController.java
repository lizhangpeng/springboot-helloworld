package com.test.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Book;
import com.test.service.UserService;


@RestController
public class HelloController {
	
	Logger logger = LogManager.getLogger(HelloController.class);
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("/hello")
	public String index() {
		logger.info("----------------------------------------------------");
		return "Hello World";
	}	

	@RequestMapping("/hello2")
	public String error() {
	    int  k =0/0;
		return "Hello World";
	}	
	
	
	

	@RequestMapping("/hello3")
	public String hello3() {
		userService.createUser("", 1);
		return "Hello World---------------";
	}	
	
	

	@RequestMapping("/hello4")
	public String hello4() {
		List<Book> list = userService.getData();
		return list.toString();
	}	

	

	@RequestMapping("/hello5")
	public String hello5() {
		userService.setData();
		  int k=0/0;
		
		return "成功";
	}	
	

}