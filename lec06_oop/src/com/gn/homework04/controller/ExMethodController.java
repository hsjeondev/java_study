package com.gn.homework04.controller;

public class ExMethodController {

	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public int addOneToHundred() {
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public String isOddEven(int number) {
		if(number % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	public String isInEnglish(String str) {
		boolean isHave = false;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				isHave = true;
				break;

			}
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				isHave = true;
				break;
			}
		}
		
		if(isHave) {
			return "영문자가 있습니다.";
		} else {
			return "영문자가 없습니다.";
		}
	}
	
	public void howCharInStr(String str, char ch) {
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		
		System.out.printf("문자열 %s 안에 문자 %c 가 %d개 있습니다.\n", str, ch, count);
	}
	
	public void timesTable(int number) {
		System.out.printf("=== %d단 ===\n", number);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d == %d\n", number, i, number*i);
		}
	}
}
