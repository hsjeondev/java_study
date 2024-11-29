package com.gn.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		
		System.out.print("정수 : ");
		userInput = scanner.nextInt();
		
		for(int i = 1; i <= userInput + 1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
