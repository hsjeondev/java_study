package com.gn.homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String email = scanner.next();
		
		String[] emails = email.split("@");
		
		String domain = emails[1];
		
		if(domain.equals("goodee.co.kr")) {
			System.out.println(emails[0].toUpperCase());
		} else {
			System.out.println("유효하지 않은 이메일입니다.");
		}

		scanner.close();
	}

}
