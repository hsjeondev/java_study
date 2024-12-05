package com.gn.study.arr.controller;

import com.gn.study.arr.model.vo.Academy;

public class Run {

	public static void main(String[] args) {
		// 1. 객체 배열 선언 Stack에 공간 생성
		Academy[] arr1;
		
		// 2. 객체 배열 생성 Heap에 배열 공간 생성
		// (1) 선언 후 생성
		arr1 = new Academy[2];
		// (2) 선언과 동시 생성
		Academy[] arr2 = new Academy[4];
		
		// 3. 객체 배열의 초기화
		// (1) 인덱스
		Academy a1 = new Academy("가남학원", "0101111111");
		arr1[0] = a1;
		arr1[1] = new Academy("나남학원", "0102222222");
		
		// (2) 선언과 동시에 초기화
		Academy[] arr3 = {new Academy("다담", "0103333333"), new Academy("라람", "0104444444"), new Academy("마맘", "0105555555")};
	
		// 4. 출력
		System.out.println(arr1); // 배열
		System.out.println(arr1[1]); // 객체
		System.out.println(arr1[1].getName()); // 객체
		System.out.println();
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i].getName());
		}
		System.out.println();
		
		for(Academy ac : arr3) {
			System.out.println(ac.getPhone());
		}
	}

}
