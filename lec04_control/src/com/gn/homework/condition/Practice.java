package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {
	
	public void practice01() { // 놀이동산 입장료 계산
		Scanner scanner = new Scanner(System.in);
		int age;
		int fare = 0;
		
		System.out.println("=== 놀이동산 입장료 계산하기===");
		System.out.print("나이 : ");
		age = scanner.nextInt();
		
		if(age <= 0){
			System.out.println("말이 된다고 생각하십니까?");
			return;
		}else if(age < 3 || age >= 65) {
			fare = 0;
		} else if(age <= 12) {
			fare = 10000;
		} else if(age <= 18) {
			fare = 20000;
		} else if(age <= 64) {
			fare = 30000;
		} 

		if(fare == 0) {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		} else {
			System.out.println("당신의 놀이동산 요금은 " + fare + "원입니다.");
		}
		
		scanner.close();
	}
	
	public void practice02() { // 일기예보
		Scanner scanner = new Scanner(System.in);
		int month;
		int temperature;
		
		System.out.println("=== 일기예보 ===");
		System.out.print("월 : ");
		month = scanner.nextInt();
		System.out.print("기온 : ");
		temperature = scanner.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			if(temperature <= -15) {
				System.out.println("겨울 한파 경보");
			} else if(temperature <= -12) {
				System.out.println("겨울 한파 주의보");
			}
		} else if(month>=6 && month<=8) {
			if(temperature >= 35) {
				System.out.println("여름 폭염 경보");
			} else if(temperature >= 35) {
				System.out.println("여름 폭염 주의보");
			}
		} else {
			System.out.println("해당하는 계절 없음");
		}

		scanner.close();
	}

	public void practice03() { // 세개의 정수 비교하기

		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int min;
		
		System.out.println("=== 세개의 정수 비교하기 ===");
		System.out.print("첫 번째 정수 : ");
		firstNumber = scanner.nextInt();
		System.out.print("두 번째 정수 : ");
		secondNumber = scanner.nextInt();
		System.out.print("세 번째 정수 : ");
		thirdNumber = scanner.nextInt();
		
		min = firstNumber < secondNumber ? (firstNumber < thirdNumber ? firstNumber : thirdNumber) : (secondNumber < thirdNumber ? secondNumber : thirdNumber); 
		
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");

		scanner.close();
	}

	public void practice04() { // 철수네 공장
		Scanner scanner = new Scanner(System.in);
		int code = 0;
		String message = "";
		
		System.out.println("=== 철수네 공자 ===");
		System.out.print("수집된 코드 : ");
		code = scanner.nextInt();
		
		switch(code) {
			case 400:
				message = "잘못된 요청입니다.";
				break;
			case 404:
				message = "요청하신 서비스를 찾을 수 없습니다.";
				break;	
			case 500:
				message = "처리 방법을 알 수 없는 문제가 발생했습니다.";
				break;	
			case 503:
				message = "일시적인 서버 오류가 발생하였습니다.";
				break;
			default :
				message = "알 수 없는 오류가 발생하였습니다.";
		}
		
		System.out.println(message);
		
		scanner.close();
	}
	
	public void practice05() { // 헬스 마니아 철수
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		String exercise = "";
		
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		
		number = scanner.nextInt();
		
		if(number >= 1 && number < 5) {
		switch(number) {
			case 1:
				exercise = "스쿼트";
				break;
			case 2:
				exercise = "데드리프트";
				break;
			case 3:
				exercise = "벤치 프레스";
				break;
			case 4:
				exercise = "풀업";
				break;
		}
		
		System.out.println(exercise + " 운동 시간입니다.");
			
		} else if(number == 5) {
			System.out.println("종료");
		} else if(number > 5) {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
		scanner.close();
	}
	
 	public void practice06() { // 합격인가? 불합격인가?
		Scanner scanner = new Scanner(System.in);
        int swDesign = 0;
        int swDev = 0;
        int dbBuild = 0;
        int pgLanguage = 0;
        int infoSysBuild = 0;
        String failSubjects = "";
        int avg = 0; 
        
        System.out.println("=== 합격인가? 불합격인가? ===");
        System.out.println("각 과목의 점수를 입력하세요.");
        System.out.print("소프트웨어설계 점수: ");
        swDesign = scanner.nextInt();
        System.out.print("소프트웨어개발 점수: ");
        swDev = scanner.nextInt();
        System.out.print("데이터베이스구축 점수: ");
        dbBuild = scanner.nextInt();
        System.out.print("프로그래밍언어활용 점수: ");
        pgLanguage = scanner.nextInt();
        System.out.print("정보시스템구축관리 점수: ");
        infoSysBuild = scanner.nextInt();
        avg = (swDesign + swDev + dbBuild + pgLanguage + infoSysBuild) / 5;

        if (swDesign < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "소프트웨어설계";
        }
        if (swDev < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "소프트웨어개발";
        }
        if (dbBuild < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "데이터베이스구축";
        }
        if (pgLanguage < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "프로그래밍언어활용";
        }
        if (infoSysBuild < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "정보시스템구축관리";
        }

        if (!failSubjects.equals("")) {
            System.out.println(failSubjects + " 과목 과락으로 불합격입니다.");
        } else if (avg < 60) {
            System.out.println("평균 점수 60점 미만으로 불합격입니다.");
        } else {
            System.out.println("합격을 축하합니다!");
        }

        scanner.close();
	}
}
