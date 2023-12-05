package com.application.restfulAPI.book.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.restfulAPI.book.dto.BookDTO;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BookDTO> getBooksInfo() throws Exception {
		
		return sqlSession.selectList("book.getBooksInfo");
	}

	@Override
	public BookDTO getBookIdInfo(long bookId) throws Exception {
		return sqlSession.selectOne("book.getBookIdInfo", bookId);
	}

	@Override
	public void insertBookInfo(BookDTO bookDTO) throws Exception {
		sqlSession.insert("book.insertBookInfo", bookDTO);
		
	}

	@Override
	public BookDTO getBooksNameInfo(BookDTO bookDTO) throws Exception {
		return sqlSession.selectOne("book.getBooksNameInfo", bookDTO);
	}

	@Override
	public void updateBookInfo(BookDTO bookDTO) throws Exception {
		sqlSession.update("book.updateBookInfo", bookDTO);
		
	}

	@Override
	public void updateBookName(BookDTO bookDTO) throws Exception {
		sqlSession.update("book.updateBookName", bookDTO);
		
	}
	
}
