package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double bmi;
		
		System.out.print("몸무게(kg) : ");
		double weight = scanner.nextDouble();
		
		System.out.print("키(m) : ");
		double height = scanner.nextDouble();
		
		bmi = weight / (height * height);
		System.out.printf("BMI 지수 : %.1f", bmi);
		
		scanner.close();
	}

}
