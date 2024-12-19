package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		String select = "";
		
		while(!select.equals("9")) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			select = sc.nextLine();
			
			switch(select) {
			case "1":
				fileSave();
				break;
			case "2":
				fileOpen();
				break;
			case "3":
				fileEdit();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it  이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String userText = sc.nextLine();
			
			if(userText.equals("ex끝it")) {
				break;
			} else {
				sb.append(userText).append("\n");
			}
		}
		
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String userFileName = sc.nextLine();
			
			if(userFileName.contains(" ")) {
				System.out.println("파일명에 띄어쓰기는 쓸 수 없습니다. 다시 입력하세요.");
			}
			
			if(fc.checkName(userFileName)) {
					System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
					String answer = sc.nextLine();
					answer = answer.toUpperCase();
					if(answer.equals("Y")) {
						fc.fileSave(userFileName, sb);
						break;
					} else if(answer.equals("N")) {
						continue;
					}
			} else {
				fc.fileSave(userFileName, sb);
				break;
			}
		}
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			StringBuilder sb = fc.fileOpen(fileName);
			System.out.print(sb.toString());
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it  이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
//				sc.nextLine();
				String userText = sc.nextLine();
				
				if(userText.equals("ex끝it")) {
					break;
				} else {
					sb.append(userText).append("\n");
				}
			}
			
			fc.fileEdit(fileName, sb);
		} else {
			System.out.println("업는 파일입니다.");
		}
	}
}
