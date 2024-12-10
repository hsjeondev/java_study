package com.gn.study.model.vo;

public class Calculator {
	
	public int divide(int a, int b) {
// 1. 모든 블록에 return을 쓴다.
//		try {
//			return a / b;
//		} catch(ArithmeticException e) {
//			return -1;
//		}
// 2. 임의의 변수를 활용한다.
		int answer = -1;
		try {
			answer = a / b;
		} catch(NullPointerException e) {
			e.printStackTrace();
		} catch(ArithmeticException e) { // 예외는 하위 클래스에서 상위 클래스 순으로
//			e.printStackTrace();
//			System.out.println("오류 : " + e.getMessage());
			System.out.println(e);
		} catch(RuntimeException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("확인");
		return answer;
	}
	
}
