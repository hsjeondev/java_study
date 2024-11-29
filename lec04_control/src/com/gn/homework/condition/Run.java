package com.gn.homework.condition;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Practice practice = new Practice();
		Scanner scanner = new Scanner(System.in);
		int select = 0;
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 놀이동산 입장료 계산하기");
		System.out.println("2. 일기예보");
		System.out.println("3. 세개의 정수 비교하기");
		System.out.println("4. 철수네 공장");
		System.out.println("5. 헬스 마니아 철수");
		System.out.println("6. 합격인가? 불합격인가?");
			
		do {
			System.out.print("선택: ");
			select = scanner.nextInt();
			System.out.println();
			
			switch(select) {
				case 1:
					practice.practice01();
					break;
				case 2:
					practice.practice02();
					break;
				case 3:
					practice.practice03();
					break;
				case 4:
					practice.practice04();
					break;
				case 5:
					practice.practice05();
					break;
				case 6:
					practice.practice06();
					break;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택하세요."); // 메시지 추가
                    break;
			}
			
		} while(select < 1 || select > 6);
		
		scanner.close();
	}

}
