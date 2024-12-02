package com.gn.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int inputNumber = scanner.nextInt();
		
		do { 
			System.out.println(inputNumber);
			inputNumber++;
		} while(inputNumber <= 10);

		scanner.close();
	}

}
