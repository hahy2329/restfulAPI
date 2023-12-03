package com.application.restfulAPI.restDTO;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {
	
	private String userId;
	private String userPassword;
	private String userEmail;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userPassword=" + userPassword + ", userEmail=" + userEmail
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
