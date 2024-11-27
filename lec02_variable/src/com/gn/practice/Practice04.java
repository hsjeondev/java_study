package com.gn.practice;

public class Practice04 {

	public static void main(String[] args) {
		
		int num1 = 10;
		double num2 = 5.7;
		
		// 문자열 + 정수하면 처음이 문자이기 때문에 다 문자로 출력, 계산식의 결과가 필요하면 () 필요
		System.out.println("정수 : " + (num1+(int)num2));
		System.out.println("실수 : " + (num1+num2));
		
		// 정수 + 문자열하면 처음이 정수이기 때문에 계산 후 문자열과 같이 출력, 문자열 이후는 다시 문자열로 취급
		System.out.println(num1 + num2 + "실수");
		System.out.println(num1 + num2 + "실수" + num1 + num2);
	}

}
