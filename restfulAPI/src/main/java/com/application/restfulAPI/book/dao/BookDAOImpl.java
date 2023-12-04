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
	
}
