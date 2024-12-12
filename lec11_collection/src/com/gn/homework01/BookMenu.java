package com.gn.homework01;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		
		int selectMenu = 0;
		
		while(true) {
			System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 오름차순 정렬");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 선택 : ");
			try {
				selectMenu = sc.nextInt();
				System.out.println();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				System.out.println();
				sc.nextLine();
				continue;
			}
			sc.nextLine();
			
			switch (selectMenu) {
		    case 1:
		    	insertBook();
		        break;
		    case 2:
		    	selectList();
		        break;
		    case 3:
		    	searchBook();
		        break;
		    case 4:
		    	deleteBook();
		        break;
		    case 5:
		    	ascBook();
		        break;
		    case 9:
		        System.out.println("프로그램을 종료합니다.");
		        break;
		    default:
		        System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		        break;
			}
			
			if(selectMenu == 9) {
				break;
			}
			
			System.out.println();
		}
	}
	
	public void insertBook() {
		
		while (true) {
			int intCategory = 0;
			String category = "";
		    int price = 0;

		    System.out.println("=== 도서 등록 ===");
		    System.out.print("도서명 : ");
		    String title = sc.nextLine();
		    System.out.print("저자명 : ");
		    String author = sc.nextLine();
		    
		    try {
		    	System.out.print("장르 : ");
			    intCategory = sc.nextInt();
			    sc.nextLine();
		    } catch (InputMismatchException e) {
		    	System.out.println("장르는 정수만 입력할 수 있습니다. 도서 등록을 처음부터 다시 시작합니다.");
		        sc.nextLine();
		        continue;
		    }

		    try {
		        System.out.print("가격 : ");
		        price = sc.nextInt();
		        sc.nextLine();
		    } catch (InputMismatchException e) {
		        System.out.println("가격은 정수만 입력할 수 있습니다. 도서 등록을 처음부터 다시 시작합니다.");
		        sc.nextLine();
		        continue;
		    }

		    switch (intCategory) {
		        case 1:
		            category = "인문";
		            break;
		        case 2:
		            category = "자연과학";
		            break;
		        case 3:
		            category = "어린이";
		            break;
		        default:
		            category = "기타";
		            break;
		    }

		    Book book = new Book(title, author, category, price);
		    bc.insertBook(book);
		    break;
		}
	}
	
	public void selectList() {
		System.out.println("=== 전체 조회 ===");
		List<Book> tempList  = bc.selectList();
		
		if(tempList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(Book book : tempList) {
				System.out.println(book);
			}
		}
	}
	
	public void searchBook() {
		System.out.println("=== 도서 검색 ===");
		System.out.print("검색어 : ");
		String seachBook = sc.next();
		List<Book> tempList = bc.searchBook(seachBook);
		
		if(tempList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book book : tempList) {
				System.out.println(book);
			}
		}
	}
	
	public void deleteBook() {
		
		System.out.println("=== 도서 삭제 ===");
		System.out.print("도서명 : ");
		String deleteTitle = sc.nextLine();
		System.out.print("저자명 : ");
		String deleteAuthor = sc.nextLine();
		
		Book remove = bc.deleteBook(deleteTitle, deleteAuthor);
		
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
	}
	
	public void ascBook() {
		int asce = bc.ascBook();
		
		if(asce == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
