package com.gn.study.controller;

import java.util.ArrayList;
import java.util.List;

public class ToDoListChecker {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// 1. 리스트가 비어있는지 확인
		if(list.isEmpty()) {
			System.out.println("할 일이 아직 없습니다.");
		}
		
		// 2. 할 일 추가
		list.add("운동하기");
		list.add("책 읽기");
		
		// 3. 특정 항목 확인
		if(list.contains("코딩 공부하기")) {
			System.out.println("O");
		} else {
			System.out.println("X");
			list.add("코딩 공부하기");
		}
		System.out.println(list);
		
		System.out.println(list.indexOf("코딩 공부하기"));
		if(list.indexOf("영화보기") == -1) {
			list.add("영화보기");
		}
		System.out.println(list);
	}
}
