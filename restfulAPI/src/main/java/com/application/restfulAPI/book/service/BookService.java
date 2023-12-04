package com.application.restfulAPI.book.service;

import java.util.List;

import com.application.restfulAPI.book.dto.BookDTO;

public interface BookService {
	
	public List<BookDTO> getBooksInfo() throws Exception;
	public BookDTO getBookIdInfo(long bookId) throws Exception;
}
