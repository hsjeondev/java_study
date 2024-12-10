package com.gn.practice03.controller;

import com.gn.practice03.exception.InvalidCredentialsException;

public class LoginManager {
	
	public void login(String id, String pwd) throws InvalidCredentialsException {
		boolean current = isValidCredentials(id, pwd);
		
		if(current) {
			System.out.println("성공적으로 로그인되었습니다.");
		} else {
			throw new InvalidCredentialsException("로그인이 실패하였습니다.\n잘못된 아이디와 비밀번호 입니다.");
		}
	}
	
	private boolean isValidCredentials(String id, String pwd) {
		String currentId = "admin";
		String currentPwd = "admin1234!";
		
		if(id.equals(currentId) && pwd.equals(currentPwd)) {
			return true;
		} else {
			return false;
		}
	}
}
