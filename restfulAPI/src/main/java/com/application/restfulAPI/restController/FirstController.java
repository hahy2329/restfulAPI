package com.application.restfulAPI.restController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.restfulAPI.restDTO.UserDTO;


/*
 * @RestController 어노테이션은 스프링 4 이상의 버전부터 지원하는 어노테이션으로, 컨트롤러 클래스에 @RestController 만 붙이면 메서드에 
 * @ResponseBody 어노테이션을 붙이지 않아도 문자열과 JSON 등을 전송할 수 있습니다. 뷰를 리턴하는 메서드들을 가지고 있는 @Controller와는 다르게
 * @RestController는 문자열, 객체 등을 리턴하는 메서드들을 가지고 있습니다.
 * */

@RestController
@RequestMapping("/rest")
public class FirstController { 
	
	@GetMapping("/hello")
	public String hello() { //String 방식 
		return "hello";
		
	}
	
	@GetMapping("/hello2")
	public UserDTO hello2() { //객체 전송(객체는 따로 설정 해두기)
		
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId("abcd");
		userDTO.setUserPassword("1234");
		userDTO.setUserEmail("abc@gmail.com");
		
		return userDTO;
	}
	
	@GetMapping("/hello3")
	public List<UserDTO> hello3() { // 리스트 객체 전송
		
		List<UserDTO> userList = new ArrayList<UserDTO>();
		
		for(int i = 0; i<2; i++) {
			UserDTO userDTO = new UserDTO();
			userDTO.setUserId("abcd" + i);
			userDTO.setUserEmail("abcd" + i + "@gmail.com");
			userDTO.setUserPassword(i+i+i+i+"aaaa");
			
			userList.add(userDTO);
			
		}
		
		return userList;
	}
	
	@GetMapping("/hello4") //map 객체 전달
	public HashMap<String, Object> hello4(){
		
		
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		
		hashMap.put("id", "abcd");
		hashMap.put("passWord", "abcde");
		hashMap.put("email", "abcde@abcde.com");
		
		return hashMap;
		
	}
	
}
