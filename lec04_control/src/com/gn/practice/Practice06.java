package com.gn.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int userInput = 0;
		System.out.print("반복문을 멈추게 할 합의 기준을 입력해주세요 : ");
		userInput = scanner.nextInt();
		
		for(int i = 1; ; i++) {
			sum += i;
			if(sum > userInput) {
				System.out.println("초과된 합 : " + sum);
				break;
			}
			System.out.println(sum);
		}
		
		// 4. 중첩 forans
		// i는 1~2 까지 하나씩 커지면서 반복
		// j는 1~3 까지 커지면서 반복
		for(int i = 1; i <=2; i++) {
			System.out.println("A");
			for(int j = 1; j <= 3; j++) {
				System.out.println("B");
			}
			System.out.println("C");
		}
		
		
		scanner.close();
	}
}