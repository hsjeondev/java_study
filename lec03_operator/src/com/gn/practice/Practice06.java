package com.gn.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x;
		int y;
		int min;
		
		System.out.print("첫번째 : ");
		x = scanner.nextInt();
		System.out.print("두번째 : ");
		y = scanner.nextInt();
		
		min = x > y ? y : x;
		
		System.out.println("두 수 중에서 작은 수는? " + min);
		
		scanner.close();
	}

}
