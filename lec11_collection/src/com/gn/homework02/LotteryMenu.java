package com.gn.homework02;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LotteryMenu {

	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		
		while(true) {
			int selectNumber = 0;
			
			try {
				System.out.println("===== 로또 번호 추첨 =====");
				System.out.println("원하시는 메뉴의 번호를 입력하세요.");
				System.out.println("1. 추첨 대상 추가");
				System.out.println("2. 추첨 대상 삭제");
				System.out.println("3. 추첨 대상 목록 조회");
				System.out.println("4. 당첨 대상 구성");
				System.out.println("5. 정렬된 당첨 대상 확인");
				System.out.println("6. 당첨 대상 검색");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 : ");
				selectNumber = sc.nextInt();
				sc.nextLine();
				
				System.out.println();
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요.");
				continue;
			}
			
			switch(selectNumber) {
				case 1 -> insertObject();
				case 2 -> deleteObject();
				case 3 -> searchObject();
				case 4 -> winObject();
				case 5 -> sortedWinObject();
				case 6 -> searchWinner();
				case 9 -> System.out.println();
				default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
			
			if(selectNumber == 9) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
	
	public void insertObject() {
	    System.out.println("===== 1. 추첨 대상 추가 =====");

	    int inputLotteries = 0;

	    while (true) {
	        try {
	            System.out.print("추가할 추첨 대상 수 : ");
	            inputLotteries = sc.nextInt();
	            sc.nextLine();

	            if (inputLotteries <= 0) {
	                System.out.println("1 이상의 정수를 입력해주세요.");
	                continue;
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("1 이상의 정수를 입력해주세요.");
	            sc.nextLine();
	            continue;
	        }

	        for (int i = 0; i < inputLotteries; i++) {
	            System.out.print("이름 : ");
	            String name = sc.nextLine();
	            System.out.print("휴대폰 번호(-빼고) : ");
	            String phone = sc.nextLine();

	            lc.insertObject(new Lottery(name, phone));
	        }

	        System.out.println(inputLotteries + "명 추가 완료했습니다.");
	        System.out.println();
	        break;
	    }
	}

	
	public void deleteObject() {
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		if(lc.deleteObject(new Lottery(name, phone))) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("해당 대상자를 찾을 수 없습니다.");
		}
	}
	
	public void searchObject() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		Set<Lottery> chancePeople = lc.searchObject();
		System.out.println(chancePeople);
	}
	
	public void winObject() {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		Set<Lottery> winners = lc.winObject();
		
		if(winners == null) {
			System.out.println("추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다.");
		} else {
			System.out.println(winners);
		}
	}
	
	public void sortedWinObject() {
		System.out.println("===== 5. 정렬된 당첨 대상 확인 =====");
		Set<Lottery> sortWinner = lc.sortedWinObject();
		Iterator<Lottery> iterator = sortWinner.iterator();
		while(iterator.hasNext()) {
			Lottery lottery = iterator.next();
			System.out.println(lottery);
		}
	}
	
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		if(lc.searchWinnder(new Lottery(name, phone))) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("아쉽게도 당첨 목록에 없습니다. 다음 기회를 노려보세요.");
		}
	}
}
