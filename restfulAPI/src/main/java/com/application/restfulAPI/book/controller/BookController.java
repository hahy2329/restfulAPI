package com.application.restfulAPI.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.restfulAPI.book.dto.BookDTO;
import com.application.restfulAPI.book.service.BookService;

@RestController
@RequestMapping("/rest")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/show/books")
	public List<BookDTO> books() throws Exception{
		
		return bookService.getBooksInfo();
		
	}
	
}
