package com.gn;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int answer = (int)(Math.random() * 50) + 1;
		int userAnswer = 0;
		
		while(answer != userAnswer) {
			
			System.out.print("1~50사이의 숫자 : ");
			try {
				userAnswer = scanner.nextInt();
				if(userAnswer > answer) {
					System.out.println("Down!");
				}
				if(userAnswer < answer) {
					System.out.println("Up!");
				} 
				if(userAnswer == answer) {
					System.out.println("축하합니다~ 정답이에요");
				}
			} catch (Exception e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				scanner.nextLine();
			}
			
		}

		scanner.close();
	}

}
