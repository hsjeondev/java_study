package com.gn.practice;

public class Practice05 {

	public static void main(String[] args) {
		
		// 1. for문
		System.out.println("=== 7단 ===");
		for(int i = 1; i < 10; i++) {
			System.out.printf("7 * %d = %d\n", i, 7*i);
		}
		
		// 2. 초기식 생략
		int a = 0;
		for(; a <= 5; a++) {
			System.out.println(a);
		}
		
		// 무한루프
		// 3. 조건식 생략
		for(int i = 1; ; i++) {
			System.out.println(i);
			if(i >= 10) {
				break;
			}
		}
		
		int sum = 0;
		
	}

}
