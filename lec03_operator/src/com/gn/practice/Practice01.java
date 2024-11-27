package com.gn.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int firstNumber = scanner.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int secondNumber = scanner.nextInt();
		System.out.println();
		
		System.out.println("첫번째 숫자: " + firstNumber);
		System.out.println("두번째 숫자: " + secondNumber);
		System.out.println();
		
		System.out.println("덧셈 : " + (firstNumber + secondNumber));
		System.out.println("뺄셈 : " + (firstNumber - secondNumber));
		System.out.println("곱셈 : " + (firstNumber * secondNumber));
		System.out.println("몫 : " + (firstNumber / secondNumber));
		System.out.println("나머지 : " + (firstNumber % secondNumber));
		
		scanner.close();
	}

}