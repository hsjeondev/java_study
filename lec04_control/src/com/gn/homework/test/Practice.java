package com.gn.homework.test;

import java.util.Scanner;

// 기능 메소드
public class Practice {
	
	// 1번 기능 : 인사말 출력
	public void practice01() {
		System.out.println("안녕하세요~");
	}
	// 2번 기능 : 두개의 숫자를 입력 받아서 합 출력
	public void practice02() {
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		num1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		System.out.println("두 숫자를 더한 값 : " + (num1 + num2));
		
		scanner.close();
	}
	
	
}
