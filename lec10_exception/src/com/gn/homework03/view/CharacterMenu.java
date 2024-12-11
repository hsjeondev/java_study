package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.controller.CharacterController;
import com.gn.homework03.exception.CharCheckException;

public class CharacterMenu {

	public void menu() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String userInput = scanner.nextLine();
		
		CharacterController characterController = new CharacterController();
		try {
			int chCount = characterController.countAlpha(userInput);
			System.out.println("\'" + userInput + "\'에 포함된 영문자 개수 : " + chCount);
		} catch(CharCheckException e) {
			e.printStackTrace();
		} finally {
			scanner.close();			
		}
		
	}
}
