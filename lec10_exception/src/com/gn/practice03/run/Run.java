package com.gn.practice03.run;

import java.util.Scanner;

import com.gn.practice03.controller.LoginManager;
import com.gn.practice03.exception.InvalidCredentialsException;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = scanner.next();
		System.out.print("비밀번호 : ");
		String pwd = scanner.next();
		
		LoginManager loginManager = new LoginManager();
		
		try {
			loginManager.login(id, pwd);
		} catch (InvalidCredentialsException e) {
			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}

}
