package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		String str = scanner.next();
		char ch = str.charAt(0);
		System.out.println(ch + "의 유니코드 : " + (int)ch);

		scanner.close();
	}

}
