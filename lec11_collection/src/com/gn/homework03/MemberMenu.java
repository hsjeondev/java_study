package com.gn.homework03;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int selectNumber = sc.nextInt();
			sc.nextLine();
			
			switch(selectNumber) {
			case 1 :
				joinMember();
				break;
			case 2 :
				login();
				break;
			case 3 :
				sameName();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("화면에 있는 번호만 입력해주세요.");
			}
			
			if(selectNumber == 9) {
				break;
			}
			
		}
		
		
	}
	
	public void memberMenu() {
		System.out.println("***** 회원 메뉴 *****");
		
		while(true) {
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
			System.out.println("먼저 회원가입, 로그인을 해주세요.");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			int selectNumber = sc.nextInt();
			
			switch(selectNumber) {
			case 1 :
				changePassword();
				break;
			case 2 :
				changeName();
				break;
			case 3 :
				System.out.println("로그아웃 되었습니다.");
				break;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
			
			if(selectNumber == 3) {
				break;
			}
		}
		
	}
	
	public void joinMember() {
		System.out.println("=== 1. 회원가입 ===");
		
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pwd = sc.next();
			System.out.print("이름 : ");
			String name = sc.next();
			
			boolean result =  mc.joinMember(id, new Member(pwd, name));
			
			if(result) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				continue;
			}
		}
		
	}
	
	public void login() {
		System.out.println("=== 2. 로그인 ===");
		
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pwd = sc.next();
			
			String sucess = mc.login(id, pwd);
			
			if(sucess != null) {
				System.out.println(sucess + "님, 환영합니다!");
				break;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
		
		memberMenu();
		
	}
	
	public void changePassword() {
		System.out.println("=== 1. 비밀번호 바꾸기 ===");
		
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("현재 비밀번호 : ");
			String oldPw = sc.next();
			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.next();
			
			boolean result = mc.changePassword(id, oldPw, newPw);
			
			if(result) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changeName() {
		System.out.println("=== 2. 이름 바꾸기 ===");
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		System.out.print("변경할 이름 : ");
		String newName = sc.next();
		
		String name = mc.changeName(id, pwd, newName);
		
		if(mc.changeName(id, pwd, newName).equals("")) {
			System.out.println("이름 변경에 실패했습니다.");
		} else {
			System.out.println(name + "에서 " + newName + "으로 이름 변경에 성공했습니다.");
		}
	}
	
	public void sameName() {
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		
		TreeMap<String, String> samePeoples = mc.sameName(name);
		
		if(samePeoples.size() == 0) {
			System.out.println("같은 이름의 회원이 없습니다.");
		} else {
			Set<Entry<String, String>> samePeoplesSet = samePeoples.entrySet();
			Iterator<Entry<String, String>> samePeopleEntry = samePeoplesSet.iterator();
			while(samePeopleEntry.hasNext()) {
				Entry<String, String> samePeole = samePeopleEntry.next();
				String key = samePeole.getKey();
				String value = samePeole.getValue();
				System.out.println(value + "-" + key);
		}
		
		
		}
	}
}
