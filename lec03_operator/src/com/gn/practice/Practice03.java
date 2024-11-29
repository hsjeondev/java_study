package com.gn.practice;

import java.util.Scanner;

public class Practice03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		
		System.out.print("숫자(1) : ");
		firstNumber = scanner.nextInt();		
		System.out.print("숫자(2) : ");
		secondNumber = scanner.nextInt();
		
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가요? " + (firstNumber > secondNumber));
	
		scanner.close();
	}

}
