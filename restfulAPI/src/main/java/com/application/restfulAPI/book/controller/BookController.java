package com.application.restfulAPI.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.restfulAPI.book.dto.BookDTO;
import com.application.restfulAPI.book.service.BookService;




@RestController
@RequestMapping("/rest")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/show/books") //책 관련 전체 조회
	public List<BookDTO> books() throws Exception{
		
		return bookService.getBooksInfo();
		
	}
	
	@GetMapping("/show/book") // 고유 ID를 통한 부분 조회
	public BookDTO book(@RequestParam("bookId") long bookId) throws Exception{
		// URL주소 창에 URL+URI?변수=변수 값을 입력하여 요청을 보낼 시 @RequestParam을 통해 해당 문자열의 값을 받아볼 수 있다.
		// long bookId 변수타입 및 변수를 선언하여 값을 해당 변수에 담아준다.
		
		BookDTO bookDTO = bookService.getBookIdInfo(bookId);
		
		return bookDTO;
		
	}
	
	
	
}
