package com.application.restfulAPI.response.dto;

import org.springframework.stereotype.Component;

@Component
public class StatusCode { //HTTP 상태 코드
	
	public static final int OK = 200; // 작업이 정상적으로 수행.
	public static final int NO_CONTENT = 204; // 작업이 수행되었으며, 별도로 내용을 반환할게 없을 때. 
	public static final int REDIRECTION = 300; // 클라이언트 측에서 이전 페이지를 재요청.
	public static final int BAD_REQUEST = 400; // 클라이언트 측에서 요청 오류.
	public static final int UNAUTHORIZED = 401; // 클라이언트가 인증되지 않았거나, 유효한 인증 정보가 부족하여 요청 거부.
    public static final int FORBIDDEN = 403; // 서버가 해당 요청을 이해했지만, 권한이 없어 요청이 거부.
    public static final int NOT_FOUND = 404; // 클라이언트가 요청한 문서를 찾지 못한 경우. 즉,요청한 데이터를 찾을 수 없는 경우.
    public static final int INTERNAL_SERVER_ERROR = 500; // 서버 측에서 응답 오류.
    public static final int SERVICE_UNAVAILABLE = 503; // 서버가 요청을 처리할 준비가 되지 않음.
    public static final int DB_ERROR = 600; // 데이터베이스 측 오류.
	
    
}
