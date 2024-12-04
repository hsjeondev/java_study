package com.gn.practice05.run;

import com.gn.practice05.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book("트렌드 코리아 2025", 17000, "김난도");
		Book book3 = new Book("트렌드 코리아 2025", "미래의 창", "김난도",  17000, 0.1);

		book1.information();
		book2.information();
		book3.information();
	}

}
