package com.gn.homework.dimensional;

import java.util.Scanner;

public class Run {
		
		public static void main(String[] args) {
			
			Practice practice = new Practice();
			Scanner scanner = new Scanner(System.in);
			int select = 0;
			
			System.out.println("실행할 기능을 선택하세요.");
			System.out.println("1. 키순서대로 앉으세요.");
			System.out.println("2. 값 입력 받아 배열 만들기");
			System.out.println("3. 올라갔다 내려갔다");
			System.out.println("4. 로또 번호 자동 생성기");
			System.out.println("5. 컴퓨터와 가위바위보");
			System.out.println("6. 배열 늘리기");
			System.out.println("7. 문서 복사하기");
			System.out.println("8. 오늘의 메뉴판 만들기");
				
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
					case 7:
						System.out.println();
						practice.practice07();
						break;
					case 8:
						System.out.println();
						practice.practice08();
						break;
					default:
						System.out.println("잘못된 선택입니다. 다시 선택하세요.");
	                    break;
				}
				
			} while(select < 1 || select > 8);
			
			scanner.close();

	}

}
