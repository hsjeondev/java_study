package com.gn.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean inputBool;
		
		System.out.print("boolean 값을 입력하세요 : ");
		inputBool = scanner.nextBoolean();
		
		System.out.println("입력한 boolean 값의 반대 : " + !inputBool);

		scanner.close();
	}

}
