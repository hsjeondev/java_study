package com.gn.homework08;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소수점이 있는 숫자: ");
		double dNum = scanner.nextDouble();
		System.out.print("10의 제곱수: ");
		int square = scanner.nextInt();
		
		double diff = Math.round(dNum * Math.pow(10, square)) / Math.pow(10, square);
		System.out.println("반올림된 결과: " + diff);
	
		scanner.close();
	}

}
