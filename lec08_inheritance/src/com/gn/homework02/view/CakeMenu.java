package com.gn.homework02.view;

import java.util.Scanner;

import com.gn.homework02.controller.ChocolateController;
import com.gn.homework02.controller.GreenTeaController;
import com.gn.homework02.model.vo.Chocolate;

public class CakeMenu {
	
	Scanner sc = new Scanner(System.in);
	ChocolateController cc = new ChocolateController();
	GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
			System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
			System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
			System.out.println("9. 취소");
			System.out.print("메뉴 번호 : ");
			String menuNumber = sc.next();
			
			switch(menuNumber) {
			case "1":
				chocolateMenu();
				break;
			case "2":
				greenTeaMenu();
				break;
			case "9":
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}
			
			System.out.println();
			
			if(menuNumber.charAt(0) == '9') break;
		}
	}
	
	public void chocolateMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("체리(개) : ");
		int cherry = sc.nextInt();
		System.out.print("초콜릿 칩(개) : ");
		int chip = sc.nextInt();
		
		String ChocoCake = cc.bakeChocolateCake(flour, cream, cherry, chip);
		System.out.println(ChocoCake);
		System.out.println("초콜릿 케이크가 완성되었습니다.");
	}
	
	public void greenTeaMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("녹차 파우더(g) : ");
		double powder = sc.nextDouble();
		System.out.print("치즈 큐브(개) : ");
		int cheese = sc.nextInt();
		
		String GreenTeaCake = gtc.bakeChocolateCake(flour, cream, powder, cheese);
		System.out.println(GreenTeaCake);
		System.out.println("치즈 케이크가 완성되었습니다.");
	}
}
