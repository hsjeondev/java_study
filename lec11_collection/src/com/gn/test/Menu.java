package com.gn.test;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc = new Scanner(System.in);
	private Controller c = new Controller();
	
	
	public void insertItem() {
		System.out.print("입력 : ");
		String str = sc.nextLine();
		
		c.insertItem2(str);
	}
	
	
}
