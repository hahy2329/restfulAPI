package com.application.restfulAPI.book.dao;

import java.util.List;

import com.application.restfulAPI.book.dto.BookDTO;

public interface BookDAO {
	
	public List<BookDTO> getBooksInfo() throws Exception;
	public BookDTO getBookIdInfo(long bookId) throws Exception;

}
