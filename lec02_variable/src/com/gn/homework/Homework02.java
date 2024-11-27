package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double area;
		double circum;
		
		System.out.print("가로 : ");
		double row = scanner.nextDouble();
		System.out.print("세로 : ");
		double col = scanner.nextDouble();
		
		area = row * col;
		System.out.println("면적 : " + area);
		
		circum = (row + col) * 2;
		System.out.println("둘레 : " + circum);
		
		scanner.close();
	}

}
