package com.gn.practice;

public class Practice01 {

	public static void main(String[] args) {
		// 철수는 친구들의 이름을 배열에 넣고 싶어졌어요.
		// 친구들 이름이 아래와 같다고 할 때,
		// 친구들의 이름을 담고 있는 배열 friends를 구성하세요.
		// 박지영, 김태우, 이지훈, 최유진, 정승호
		// 인덱스, 선언+초기화

		String[] friends1 = new String[5];
		friends1[0] = "박지영";
		friends1[1] = "김태우";
		friends1[2] = "이지훈";
		friends1[3] = "최유진";
		friends1[4] = "정승호";
		String[] friends2;
		friends2 = new String[] {"박지영", "김태우", "이지훈", "최유진", "정승호"};
		String[] friends3 = {"박지영", "김태우", "이지훈", "최유진", "정승호"};
		
		for(int i = 0; i < friends1.length; i+=2) {
			System.out.println((i+1) + " : " + friends1[i]);
		}		
	}

}
