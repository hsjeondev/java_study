package com.gn.practice;

import java.util.Scanner;

public class Practice06_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x;
		int y;
		int z;
		int max;
		
		System.out.print("첫번째 수 : ");
		x = scanner.nextInt();
		System.out.print("두번째 수 : ");
		y = scanner.nextInt();
		System.out.print("세번째 수 : ");
		z = scanner.nextInt();
		
		max = x > y ? (x > z ? x : z) : (y > z ? y : z);
		
		System.out.println("세 수 중에서 가장 큰 수는? " + max);
		
		scanner.close();
	}

}
