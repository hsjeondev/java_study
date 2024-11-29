package com.gn.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.print("성적 입력 : ");
		score = scanner.nextInt();
		
		if(score > 90) {
			grade = 'A';
		} else if(score > 80) {
			grade = 'B';
		} else if(score > 70) {
			grade = 'C';
		} else if(score > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 학점은 %c입니다.", grade);

		scanner.close();
	}

}
