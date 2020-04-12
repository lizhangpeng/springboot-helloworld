package com.test.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.test.dao.BookMapper;
import com.test.entity.Book;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private BookMapper bookMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void createUser(String name, Integer age) {
		// TODO Auto-generated method stub
		System.out.println("ssss");
		//jdbcTemplate.update("INSERT INTO `test`.`books` (`id`, `title`, `price`, `publishDate`) VALUES ('10', 'Java------------', '98.50', '2005-01-02 00:00:00');");
	}

	@Override
	public List<Book> getData() {
		return bookMapper.getData();
	}

	@Override
	public int setData() {
		return bookMapper.setData();
	}
	


}
