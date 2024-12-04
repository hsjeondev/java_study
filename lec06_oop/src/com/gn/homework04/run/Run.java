package com.gn.homework04.run;

import com.gn.homework04.controller.ExMethodController;

public class Run {

	public static void main(String[] args) {
		
		ExMethodController exMethodController = new ExMethodController();

		System.out.println("=== 전달된 메시지 출력 ===");
		exMethodController.printMessage("안녕하세요");
		System.out.println();
		
		System.out.println("=== 1~100까지 합 반환 ===");
		int sum = exMethodController.addOneToHundred();
		System.out.println(sum);
		System.out.println();
		
		System.out.println("=== 전달된 정수는 홀수? 짝수? ===");
		String oddOrEven = exMethodController.isOddEven(7);
		System.out.println(oddOrEven);
		System.out.println();
		
		System.out.println("=== 전달된 문자열에 영문자가 있는가? ===");
		String inEnglish = exMethodController.isInEnglish("안녕하세요");
		System.out.println(inEnglish);
		System.out.println();
		
		System.out.println("=== 전달 받은 문자열 안에 전달 받은 문자가 몇 개 있는가? ===");
		exMethodController.howCharInStr("aaabbcc", 'a');
		System.out.println();
		
		System.out.println("=== 전달된 정수의 구구단 출력 ===");
		exMethodController.timesTable(9);
	
	
	}

}
