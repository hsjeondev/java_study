package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	
	public void practice01() { // 1~50까지 짝수 합하기
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		int sum = 0;
		
		System.out.println("=== 1~50까지 짝수 합하기 ===");
		while(true) {
			System.out.print("정수(1~50) : ");
			inputNumber = scanner.nextInt();
			
			if(inputNumber < 1 || inputNumber > 50) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
				continue;
			}
			
			
			for(int i = 2; i <= inputNumber; i+=2) {
				sum += i;
			}
			
			System.out.println("합계 : " + sum);
			break;
			
		}
		
		
		scanner.close();
	}
    
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
    
    public void practice03() { // 탈출합시다.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 탈출합시다. ===");
        
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

    public void practice04() { // 게임 재시작
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 게임 재시작 ===");
        System.out.println("게임을 실행합니다!");

        do {
            System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
            String message = scanner.next();

            if (message.equals("yes")) {
                System.out.println("게임을 실행합니다!");
                continue;
            } else if (message.equals("no")) {
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 입력이 아닙니다.");
                continue;
            }
        } while (true);

        scanner.close();
    }
    
    public void practice05() { // 양수만 더하기
    	
    	Scanner scanner = new Scanner(System.in);
    	int sum = 0;
    	
    	System.out.println("양수만 더하기");
    	while(true) {
    		System.out.print("숫자(0을 입력하면 종료) : ");
    		int number = scanner.nextInt();
    		
    		if(number == 0) {
    			break;
    		} else if(number > 0) {
    			sum += number;
    		}
    	}
    	
    	System.out.println("양수의 합계 : " + sum);
    }

    public void practice06() { // 트리 만들기
    	
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

    public void practice07() { // 박수박수박
    
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

    public void practice08() { // 문자열의 개수
        Scanner scanner = new Scanner(System.in);
        String inputContinue = "";

        System.out.println("=== 문자열 개수 ===");
        do {
            System.out.print("문자열 : ");
            String inputString = scanner.next();
            System.out.print("문자 : ");
            char inputLetter = scanner.next().charAt(0);

            int sum = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == inputLetter) {
                    sum++;
                }
            }
            System.out.println("포함된 개수 : " + sum);

            do {
                System.out.print("다시 입력하시겠습니까? (y/n) : ");
                inputContinue = scanner.next();

                if (!inputContinue.equalsIgnoreCase("y") && !inputContinue.equalsIgnoreCase("n")) {
                    System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
                }
            } while (!inputContinue.equalsIgnoreCase("y") && !inputContinue.equalsIgnoreCase("n"));

        } while (inputContinue.equalsIgnoreCase("y"));

        scanner.close();
    }

}
