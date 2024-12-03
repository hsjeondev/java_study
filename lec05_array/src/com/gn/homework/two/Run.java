package com.gn.homework.two;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Practice practice = new Practice();
		Scanner scanner = new Scanner(System.in);
		int select = 0;
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 거꾸로 4 x 4 배열");
		System.out.println("2. 랜덤 4 x 4 배열");
		System.out.println("3. 알파벳 랜덤 2차원 배열");
		System.out.println("4. 문장 출력하기");
		System.out.println("5. 자리 배치하기");
		System.out.println("6. 학생의 위치 출력");
			
		do {
			System.out.print("선택: ");
			select = scanner.nextInt();
			
			switch(select) {
				case 1:
					System.out.println();
					practice.practice01();
					break;
				case 2:
					System.out.println();
					practice.practice02();
					break;
				case 3:
					System.out.println();
					practice.practice03();
					break;
				case 4:
					System.out.println();
					practice.practice04();
					break;
				case 5:
					System.out.println();
					practice.practice05();
					break;
				case 6:
					System.out.println();
					practice.practice06();
					break;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    break;
			}
			
		} while(select < 1 || select > 6);
		
		scanner.close();

	}

}
