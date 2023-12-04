package com.application.restfulAPI.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.restfulAPI.book.dao.BookDAO;
import com.application.restfulAPI.book.dto.BookDTO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;
	
	@Override
	public List<BookDTO> getBooksInfo() throws Exception {
		
		return bookDAO.getBooksInfo();
	}

	@Override
	public BookDTO getBookIdInfo(long bookId) throws Exception {
		return bookDAO.getBookIdInfo(bookId);
	}

}
