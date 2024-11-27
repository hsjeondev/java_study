package com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int korean;
		int english;
		int math;
		int totalScore;
		int avg;
		
		System.out.print("국어 : ");
		korean = scanner.nextInt();
		System.out.print("영어 : ");
		english = scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
		
		totalScore = korean + english + math;
		avg = totalScore / 3;
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + avg);
		
		scanner.close();
	}

}
