package com.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

import com.test.entity.Book;

public interface BookMapper {

	@Select("SELECT * FROM books")
	List<Book> getData();
	
	@Insert("INSERT INTO `test`.`books` (`id`, `title`, `price`, `publishDate`) VALUES ('19', 'Java9999999999', '98.50', '2005-01-02 00:00:00');")
	int setData();
}
