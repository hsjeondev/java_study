package com.gn.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gn.study.model.vo.Container;
import com.gn.study.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// Boxing
		Integer iNum = 100;
		// Unboxing
		int num = iNum;
		// parse메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1+str2);
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1+num2);
		
		str2 = "1.34";
		System.out.println(str2+str2);
		double num3 = Double.parseDouble(str2);
		System.out.println(num3+num3);
		
		
		// NumberFormatException
		try {
		String[] arr = new String[3];
		arr[0] = "일";
		int arrNum = Integer.parseInt(arr[0]);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열");
		System.out.println();
		
		// ClassCastException
		try {
			Object o = 9;
			String oStr = (String)o;			
		} catch(ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("선넘은 형변환");
		System.out.println();

		
		// 제네릭
		Container<Integer> con = new Container<Integer>();
		con.setItem(50);
		
		Container<String> tain = new Container<String>();
		tain.setItem("안녕하세요.");
		
		System.out.println(con.getItem());
		System.out.println(tain.getItem());
		System.out.println();
		
		
		// List(ArrayList)
		// 1. 선언과 생성
		List<String> list = new ArrayList<String>();
		
		// 2. 추가
		List<String> meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("점심");
		System.out.println(meal); // List는 이미 toString이 만들어져있음.
		
		meal.add(1, "간식");
		System.out.println(meal);
		
		// 3. 삭제
//		meal.remove("간식"); ->  이것도 됨 하지만 비추
		meal.remove(1); // 주로 객체를 담기에 특정한 객체가 내가 지우고 싶은 객체와 같은지 판단 어려움. 그래서 인덱스 권장
		System.out.println(meal);
		
		meal.clear();
		System.out.println(meal);
		
		// 4. 요소 변경
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(15);
		nums.add(10);
		nums.add(23);
		System.out.println(nums);
		nums.set(1, 500);
		System.out.println(nums);
		
		// 5. 요소 조회
		System.out.println(nums.get(0));
		for(int i = 0; i < nums.size(); i++) {
			System.out.println(i + " : " + nums.get(i));
		}
		for(Integer n : nums) {
			System.out.println(n);
		}
		
		// ArrayList의 정렬
		System.out.println("정렬 전 : " + nums);
		Collections.sort(nums);
		System.out.println("오름차순 : " + nums);
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println("내림차순 : " + nums);
		
		// ArrayList<객체>
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("김철수", 50));
		
		System.out.println(students);
		
		if(students.contains(new Student("김철수", 50))) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		if(students.indexOf(new Student("김철수", 50)) != -1) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		students.add(new Student("홍길동", 30));
		students.add(new Student("이영희", 40));
		System.out.println("정렬 전 : " + students);
		Collections.sort(students);
		System.out.println("정렬 후 : " + students);
		
	}

}
