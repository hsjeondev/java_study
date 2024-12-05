package com.gn.study.constructor.model.vo;

public class Student {
	// 학생 번호 조회
	public void printInfo(int num) {
		System.out.println("당신의 번호는 " + num);
	}
	
	public void printInfo(String name) {
		System.out.println("당신의 이름은 " + name + "입니다.");
	}
	
	// 학생 번호, 이름 조회
	public void printInfo(int num, String name) {
		System.out.println(name + "님의 학번은 " + num + "입니다.");
	}
	
	// 이름, 번호 조회
	public void printInfo(String name, int num) {
		
	}
	
//	// 학생 나이 조회 
//	public void printInfo(int age) {
//		-> 이미 같은 메소드명 + int 매개변수 메소드가 있음. 오류
//	}
	
//	public void test(int i) {} // 기준
//	
//	public void test(String str){}             // 1번
//	public void test(int i, String str){}      // 2번
//	public void test(int num){}                // 3번
//	public char test(int point){}              // 4번
//	public void test(int i, int k){}           // 5번
//	public void test(int num, String string){} // 6번
//	public void test(String str, int i){}      // 7번
	
	// 오버로딩 성립 : 1, 5, 7
	// 오버로딩 미성립 : 2, 3, 4, 6
	
	// 3, 4번이 기준과 겹치면 기준과 3, 4번 다 안 됨.
	// 2번이 성립이 안 되는 이유, 밑에 6번이랑 타입이 같기에 둘 다 안 됨. 
	// 위에 있는 2번은 될 줄 알았으나 겹치면 둘 다 안 됨.
	// 6번 혹은 2번 주석하면 나머지 1개 됨.
}
