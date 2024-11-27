package com.gn.homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str;
		int charConversionInt;
		int square;
		
		System.out.print("한 자리 숫자를 입력하세요 : ");
		str = scanner.nextLine();
		charConversionInt = str.charAt(0) - '0';
		square = charConversionInt * charConversionInt;
		
		System.out.println("입력한 숫자의 제곱은 " + square + "입니다.");
	
		scanner.close();
	}

}
