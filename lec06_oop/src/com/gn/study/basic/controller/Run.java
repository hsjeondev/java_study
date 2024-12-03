package com.gn.study.basic.controller;

//import java.util.Date;
//import java.util.Scanner;

import java.util.*; // *을 와일드카드라고 부름	

import com.gn.study.basic.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		
		
		// 1. 참조변수 선언 -> Stack에 주소값 담을 공간 생김
		Car c1;
		// 2. new연산자 사용해서 객체 생성
		c1 = new Car();
		// 3. 동시 진행(선언, 생성)
		Car c2 = new Car();
		
		// 클래스명은 같지만
		// 패키지 위치는 다른 클래스 동시에 사용할 경우
		// 클래스 앞에 패키지 명을 붙여줘야 함
		com.gn.study.field.model.vo.Car c3 = new com.gn.study.field.model.vo.Car();
	
		
	
	}

}
