package com.gn.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("메시지 : ");
		String inputMessage = scanner.nextLine();
		
		for(int i = 0; i < inputMessage.length(); i++) {
			if(inputMessage.charAt(i) == ' ') {
				continue;
			}
			System.out.print(inputMessage.charAt(i));
		}

		scanner.close();
	}

}