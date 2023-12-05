package com.application.restfulAPI.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.restfulAPI.book.dto.BookDTO;
import com.application.restfulAPI.book.service.BookService;


@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/books") //전체 조회 : 책 관련 전체 조회
	public List<BookDTO> books() throws Exception{
		
		return bookService.getBooksInfo();
		
	}
	
	@GetMapping("/books/{bookId}") // 부분 조회 : 고유 ID를 통한 부분 조회 (PathVariable 사용)
	public BookDTO books(@PathVariable long bookId) throws Exception{
		
		BookDTO bookDTO = bookService.getBookIdInfo(bookId);
		
		return bookDTO;
		
	}
	
	@PostMapping("/books") //신규 도서 생성 : bookName, bookAuthor, bookPrice를 쿼리 스트링으로 입력 후 요청 시  bookDTO객체에 저장하여 DB저장 
	public BookDTO books(@ModelAttribute BookDTO bookDTO) throws Exception{
		
		bookService.insertBookInfo(bookDTO);
		
		return bookService.getBooksNameInfo(bookDTO); // DB에 저장이 되었는지 확인을 위해 사용자에게 해당 데이터를 전달해준다.
		
	}
	
	@PutMapping("/books/{bookId}") //전체 수정 : 책의 고유 ID를 통한 해당 정보를 전체 수정한다.
	public BookDTO books(@PathVariable long bookId, @ModelAttribute BookDTO bookDTO) throws Exception{
		
		bookDTO.setBookId(bookId);
		
		bookService.updateBookInfo(bookDTO);
		
		return bookService.getBookIdInfo(bookId); //DB에 수정이 제대로 이루어졌는지 확인을 위해 데이터를 전달해준다.
	}
	
	@PatchMapping("/books/{bookId}") //부분 수정 : 책의 고유 ID를 통해 책 이름을 수정한다.
	public BookDTO books(@PathVariable long bookId, @RequestParam("bookName") String bookName) throws Exception{
		
		BookDTO bookDTO = new BookDTO();
		bookDTO.setBookId(bookId);
		bookDTO.setBookName(bookName);
		
		bookService.updateBookName(bookDTO);
		
		return bookService.getBookIdInfo(bookId); //DB에 수정이 제대로 이루어졌는지 확인을 위해 데이터를 전달해준다.
	}
	
	
}
