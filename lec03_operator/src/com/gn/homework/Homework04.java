package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int korean;
		int math;
		int english;
		int sum;
		int avg;
		String isChangePhone;
		
		System.out.print("국어 : ");
		korean = scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
		System.out.print("영어 : ");
		english = scanner.nextInt();
		
		sum = korean + math + english;
		avg = sum / 3;
		
		isChangePhone = korean >= 60 && math >= 60 && english >= 60 && avg >= 90 ? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다.";

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(isChangePhone);
		
		scanner.close();
	}

}
