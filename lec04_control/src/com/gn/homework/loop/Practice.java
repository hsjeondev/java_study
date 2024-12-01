package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
    
    public void practice02() { // 구구단 무한반복
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 구구단 무한반복 ===");
        
        while(true) {
            System.out.print("숫자 : ");
            int inputNumber = scanner.nextInt();
            
            if(inputNumber == 0) {
                System.out.println("종료합니다.");
                break;
            }
            
            if(inputNumber >= 1 && inputNumber <= 9) {
                for(int i = inputNumber; i < 10; i++) {
                    System.out.printf("=== %d단 ===\n", i);
                    for(int j = 1; j < 10; j++) {
                        System.out.printf("%d * %d = %d\n", i, j, i * j);
                    }
                    System.out.println();
                }
            } else if(inputNumber < 0) {
                System.out.println("양수만 입력해주세요.");
            } else {
                System.out.println("9 이하의 숫자만 입력해주세요.");
            }
        }
        
        scanner.close();
    }

    public void practice03() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 탈출합시다 ===");
        
        while(true) {
        
        	System.out.print("입력 : ");
        	String userInput = scanner.nextLine();
        	
        	if(userInput.equals("탈출")) {
        		System.out.println("프로그램 종료");
        		break;
        	}
        	
        	System.out.println(userInput);
        }
        
        scanner.close();
    }

    public void practice06() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("=== 트리 만들기 ===");
    	
    	System.out.print("만들고 싶은 트리의 높이를 입력하세요 : ");
        int height  = scanner.nextInt();
        
        for(int i = 0; i < height; i++) {
        	
        	for(int j = 0; j < height - 1 - i; j++) {
        		System.out.print(" ");
        	}
        	
        	for(int k = 0; k < (2*i) + 1; k++) {
        		System.out.print("*");
        	}
        	
        	System.out.println();
        }
        
        scanner.close();
    }

    public void practice07() {
    
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("=== 박수박수박 === ");
    	
    	while (true) {
            System.out.print("정수 : ");
            int inputNumber = scanner.nextInt();

            if (inputNumber <= 0) {
                System.out.println("양수가 아닙니다.");
                continue;
            }

            for (int i = 1; i <= inputNumber; i++) {
                if (i % 2 == 1) {
                    System.out.print("박");
                } else {
                    System.out.print("수");
                }
            }

            System.out.println();
            break;
        }
    	
    	scanner.close();
    }
}
