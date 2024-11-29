package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int min;
		
		System.out.println("=== 세개의 정수 비교하기 ===");
		System.out.print("첫 번째 정수 : ");
		firstNumber = scanner.nextInt();
		System.out.print("두 번째 정수 : ");
		secondNumber = scanner.nextInt();
		System.out.print("세 번째 정수 : ");
		thirdNumber = scanner.nextInt();
		
		min = firstNumber < secondNumber ? (firstNumber < thirdNumber ? firstNumber : thirdNumber) : (secondNumber < thirdNumber ? secondNumber : thirdNumber); 
		
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");

		scanner.close();
	}

}
