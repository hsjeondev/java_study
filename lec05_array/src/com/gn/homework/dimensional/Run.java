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
			System.out.println("4. 컴퓨터와 가위바위보");
				
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
					default:
						System.out.println("잘못된 선택입니다. 다시 선택하세요.");
	                    break;
				}
				
			} while(select < 1 || select > 4);
			
			scanner.close();

	}

}
