package com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String rrNumber;
		char genderNumber;
		String gender;
		
		System.out.print("주민번호(-) : ");
		rrNumber = scanner.next();
		
		genderNumber = rrNumber.charAt(7);
		
		gender = genderNumber == '1' || genderNumber == '3' ? "남성" : genderNumber == '2' || genderNumber == '4' ? "여성" : "잘못된 값";
		
		System.out.println("입력하신 주민번호는 " + gender + "입니다.");
				
		scanner.close();
	}

}
