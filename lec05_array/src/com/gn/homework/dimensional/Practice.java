package com.gn.homework.dimensional;

import java.util.Scanner;
import java.util.Random;

public class Practice {

	public void practice01() { // 키 순서대로 앉으세요
		int[] heights = {152, 180, 165, 158, 171};
		
		System.out.println("=== 키 순서대로 앉으세요. ===");
		
		for(int i = 0; i < heights.length; i++) {
			for(int j = i+1; j < heights.length; j++) {
				if(heights[i] > heights[j]) {
					int temp = heights[i];
					heights[i] = heights[j];
					heights[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < heights.length; i++) {
			System.out.print(heights[i]);
			if(i != heights.length-1) {
				System.out.print(", ");
			}
		}
	}
	
	public void practice02() { // 값 입력 받아 배열 만들기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== 값 입력 받아 배열 만들기 ===");
		
		System.out.print("정수 : ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			numbers[i] = scanner.nextInt();
		}
		
		int sum = 0;
		for(int number : numbers) {
			System.out.print(number + " ");
			sum += number;
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		scanner.close();
	}
	
	public void practice03() { // 올라갔다 내려갔다
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== 올라갔다 내려갔다 ===");
		
		while(true) {
			System.out.print("정수 : ");
			int number = scanner.nextInt();
			if(number % 2 == 0 && number < 0) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			int n = 0;
			for(int i = 0; i < number/2+1; i++) {
				n++;
				System.out.print(n + ", ");
			}
			for(int i = 0; i < number/2; i++) {
				n--;
				if(i != number/2-1) {
					System.out.print(n + ", ");
				} else {
					System.out.print(n);
				}
			}
			break;
			
		}
		
	}
	
	public void practice04() { // 로또 번호 자동 생성기
	    int[] lotto = new int[6];

	    System.out.println("=== 로또 번호 자동 생성기 ===");
	    
	    for(int i = 0; i < lotto.length; i++) {
	    	int randomNumber;
	    	boolean isOverlap = false;
	    	
	    	do {
	    		randomNumber = (int)(Math.random() * (45 + 1 - 1)) + 1;
	    		isOverlap = false;
	    		
	    		for(int j = 0; j < i; j++) {
	    			if(lotto[j] == randomNumber) {
	    				isOverlap = true;
	    				break;
	    			}
	    		}
	    		
	    	} while(isOverlap);
	    	
	    	lotto[i] = randomNumber;
	    }

	    for(int i = 0; i < lotto.length; i++) {
	    	for(int j = i+1; j < lotto.length; j++) {
	    		if(lotto[i] > lotto[j]) {
	    			int temp = lotto[i];
		    		lotto[i] = lotto[j];
		    		lotto[j] = temp;
	    		}
	    	}
	    }
	    
	    for(int number : lotto) {
	    	System.out.print(number + " ");
	    }
	}

	public void practice05() { // 컴퓨터와 가위바위보
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] choices = {"가위", "바위", "보"};
        int[] game = {0, 0, 0, 0};

        System.out.println("=== 컴퓨터와 가위바위보 ===");
        
        while (true) {
            System.out.print("가위바위보 : ");
            String userRandom = scanner.next();

            if (userRandom.equals("stop")) {
                System.out.println(game[0] + "전 " + game[1] + "승 " + game[2] + "무 " + game[3] + "패");
                break;
            }

            if (!userRandom.equals("가위") && !userRandom.equals("바위") && !userRandom.equals("보")) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println();
                continue;
            }

            int comRandom = random.nextInt(3);
            String comChoice = choices[comRandom];

            System.out.println("컴퓨터 : " + comChoice);
            System.out.println("사용자 : " + userRandom);

            if (userRandom.equals(comChoice)) {
                game[2]++;
                System.out.println("비겼습니다");
            } else if ((userRandom.equals("가위") && comChoice.equals("보")) ||
                    (userRandom.equals("바위") && comChoice.equals("가위")) ||
                    (userRandom.equals("보") && comChoice.equals("바위"))) {
                game[1]++;
                System.out.println("이겼습니다 !");
            } else {
                game[3]++;
                System.out.println("졌습니다 ㅠㅠ");
            }
            System.out.println();

            game[0]++;
        }

        scanner.close();
	}
	
	public void practice06() { // 배열 늘리기
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 배열 늘리기 ===");
        
        System.out.print("배열 크기를 입력하세요 : ");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] strArr = new String[size];
        char answer;

        for (int i = 0; i < strArr.length; i++) {
            System.out.printf("%d번째 문자열 : ", i + 1);
            strArr[i] = scanner.nextLine();
        }

        while (true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            answer = scanner.next().charAt(0);
            scanner.nextLine();

            if (answer == 'N' || answer == 'n') {
                break;
            }

            System.out.print("더 입력하고 싶은 개수 : ");
            int moreSize = scanner.nextInt();
            scanner.nextLine();

            String[] moreArr = new String[strArr.length + moreSize];
            for (int i = 0; i < strArr.length; i++) {
                moreArr[i] = strArr[i];
            }

            for (int i = strArr.length; i < moreArr.length; i++) {
                System.out.printf("%d번째 문자열 : ", i + 1);
                moreArr[i] = scanner.nextLine();
            }

            strArr = moreArr;
        }

        for (String str : strArr) {
            System.out.println(str);
        }
        
        scanner.close();
    }

	public void practice07() { // 문서 복사하기
		String[] report = {"Introduction", "Research", "Conclusion"};
		String[] copyReport = new String[report.length];
		
		System.out.println("=== 문서 복사하기 ===");
		
		for(int i = 0; i < report.length; i++) {
			if(i == 0) {
				copyReport[i] = "Team Feedback";
				continue;
			}
			copyReport[i] = report[i];
		}
		
		System.out.print("원본 보고서: ");
		for(int i = 0; i < report.length; i++) {
			System.out.print(report[i]);
			if(i != report.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		System.out.print("복사된 보고서: ");
		for(int i = 0; i < copyReport.length; i++) {
			System.out.print(copyReport[i]);
			if(i != copyReport.length-1) {
				System.out.print(", ");
			}
		}
	}

	public void practice08() { // 오늘의 메뉴판 만들기
		
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad","Soup"};
		String[] newMenu = new String[menu.length + add.length];
		
		 System.out.println("=== 오늘의 메뉴판 만들기 ===");
		
		for(int i = 0; i < newMenu.length; i++) {
			if(i < menu.length) {
				newMenu[i] = menu[i];
				continue;
			}
			newMenu[i] = add[i-3];
		}
		
		System.out.print("어제 메뉴판: ");
		for(int i = 0; i < menu.length; i++) {
			System.out.print(menu[i]);
			if(i != menu.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.print("오늘 메뉴판: ");
		for(int i = 0; i < newMenu.length; i++) {
			System.out.print(newMenu[i]);
			if(i != newMenu.length-1) {
				System.out.print(", ");
			}
		}
		
	}
}