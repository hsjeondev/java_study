package com.gn.homework04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String userInput = "";
		String result = "";
		
		while(!userInput.toUpperCase().equals("N")) {
			System.out.print("문자열 : ");
			userInput = scanner.next();
			
			if(!userInput.toUpperCase().equals("N")) {
				result += userInput;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		System.out.println("최종 문자열 : " + result);
		

	}

}
