package com.gn.homework.loop;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Practice practice = new Practice();
        int select = 0;

        System.out.println("실행할 기능을 선택하세요.");        
        System.out.println("1. 1~50까지 짝수 합하기");
        System.out.println("2. 구구단 무한반복");
        System.out.println("3. 탈출합시다.");
        System.out.println("4. 게임 재시작");
        System.out.println("5. 양수만 더하기");
        System.out.println("6. 트리 만들기");
        System.out.println("7. 박수박수박");
        System.out.println("8. 문자열의 개수");
        
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
            
        } while(select < 1 && select > 8);

        scanner.close();
    }
}
