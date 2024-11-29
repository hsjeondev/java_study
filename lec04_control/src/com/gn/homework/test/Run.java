package com.gn.homework.test;

import java.util.Scanner;
// 메인 메소드 -> 실행
public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Practice practice = new Practice();
		int menu;
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 인사하기");
		System.out.println("2. 두 정수의 합 구하기");
		System.out.print("선택 : ");
		menu = scanner.nextInt();
		System.out.println();
		
		switch(menu) {
			case 1:
				practice.practice01();
				break;
			case 2:
				practice.practice02();
				break;
			default:
				System.out.println("실행할 기능이 없습니다.");
		}
		System.out.println("[종료]");
		
		scanner.close();
	}

}
