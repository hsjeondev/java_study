package com.gn.study.method.model.vo;

public class VendingMachine {
	// 1. 인사
	public void sayHi() { // 메소드 선언부
		System.out.println("환영합니다~");
		//return; 생략 가능
	}
	// 2. 남아있는 잔돈(기본형) 리턴
	public int getBalance() {
//		int balance = 500;
//		return balance;
		return 500;
	}
	// 3. 음료수 종류(배열) 리턴
	public String[] sodaList() {
//		String[] arr = new String[] {"콜라", "사이다", "오렌지 주스"};
//		return arr;
		return new String[] {"콜라", "사이다", "오렌지 주스"};
	}
	// 4. 선택된 음료수 객체 리턴
	public Soda selectedSoda() {
//		Soda s1 = new Soda();
//		return s1;
		return new Soda();
	}
	
}
