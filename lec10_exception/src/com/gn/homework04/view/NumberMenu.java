package com.gn.homework04.view;

import java.util.Scanner;

import com.gn.homework04.controller.NumberController;
import com.gn.homework04.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = scanner.nextInt();
		System.out.print("정수2 : ");
		int num2 = scanner.nextInt();
		
		NumberController numberController = new NumberController();
		
		try {
			boolean check = numberController.checkDouble(num1, num2);
			System.out.printf("%d은(는) %d의 배수인가? ", num1, num2);
			System.out.print(check);
		} catch(NumRangeException e) {
			e.printStackTrace();
		} finally {
			scanner.close();			
		}
		
	}
}
