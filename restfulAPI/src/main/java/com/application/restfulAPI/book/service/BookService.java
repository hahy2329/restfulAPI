package com.application.restfulAPI.book.service;

import java.util.List;

import com.application.restfulAPI.book.dto.BookDTO;

public interface BookService {
	
	public List<BookDTO> getBooksInfo() throws Exception;
	public BookDTO getBookIdInfo(long bookId) throws Exception;
	public void insertBookInfo(BookDTO bookDTO) throws Exception;
	public BookDTO getBooksNameInfo(BookDTO bookDTO) throws Exception;
	public void updateBookInfo(BookDTO bookDTO) throws Exception;
	public void updateBookName(BookDTO bookDTO) throws Exception;
	
	
	
}
