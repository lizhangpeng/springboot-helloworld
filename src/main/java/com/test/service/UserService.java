package com.test.service;

import java.util.List;

import com.test.entity.Book;

public interface UserService {

	public void createUser(String name, Integer age);
	
	List<Book> getData();
	
	int setData();
}
