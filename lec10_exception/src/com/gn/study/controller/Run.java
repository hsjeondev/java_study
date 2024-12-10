package com.gn.study.controller;

import com.gn.study.model.vo.Account;
import com.gn.study.model.vo.Calculator;
import com.gn.study.model.vo.InsufficientBalanceException;
import com.gn.study.model.vo.User;

public class Run {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		
		try {			
			System.out.println(a/b);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눈면 안돼요!!");
		} finally {
			System.out.println("계산끝!!");			
		}
		
		
		System.out.println("===== Null 조심 =====");
		String[] arr = new String[3];
		try {
			System.out.println(arr[0].length());
		} catch(NullPointerException e) {
			System.out.println("오류가 발생했어요!!");
		}
//		System.out.println(null.length()); -> 컴파일에서의 오류
		
		System.out.println("===== 배열 조심 =====");
		int[] numbers = {1, 2, 3};
		try {
			System.out.println(numbers[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 초과한 인덱스를 쓰셨네요!!");
		}
		
		
		Calculator c = new Calculator();
		c.divide(3, 0);
		
		
		User u = new User();
//		try {
//			u.checkAge(18);
//		} catch(IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			u.nameLength(null);
//		} catch(NullPointerException e) {
//			e.printStackTrace();
//		}
		try {
			u.checkAge(10);
			u.nameLength(null);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("확인!!");
		
		
		Account account = new Account("전홍식", 1000);
		try {
			account.withdraw(5000);
		} catch(InsufficientBalanceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
