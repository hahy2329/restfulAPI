package com.application.restfulAPI.book.service;

import java.util.List;

import com.application.restfulAPI.book.dto.BookDTO;

public interface BookService {
	
	public List<BookDTO> getBooksInfo() throws Exception; // 전체 조회
	public BookDTO getBookIdInfo(long bookId) throws Exception; // 도서 ID를 통한 부분 조회
	public void insertBookInfo(BookDTO bookDTO) throws Exception; // 도서 데이터 생성
	public BookDTO getBooksNameInfo(BookDTO bookDTO) throws Exception; // 도서 데이터를 생성 이후 사용자에게 반환하기 위해 도서 이름을 통한 데이터 조회
	public void updateBookInfo(BookDTO bookDTO) throws Exception; // 도서 ID를 통한 전체 수정
	public void updateBookName(BookDTO bookDTO) throws Exception; // 도서 ID를 통한 부분(도서 이름) 수정
	public void deleteBookIdInfo(long bookId) throws Exception; // 도서 ID를 통한 삭제
	
	
}
