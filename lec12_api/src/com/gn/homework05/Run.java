package com.gn.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("생년월일 : ");
		String birthDay = scanner.next();
		
		String passWord = name.substring(0, 1) + birthDay.substring(2, 4) + birthDay.substring(6) +name.substring(1);
		System.out.println("암호 : " + passWord);
		
		scanner.close();
	}

}
