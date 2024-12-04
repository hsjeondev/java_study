package com.gn.homework03.controller;

import com.gn.homework03.model.vo.Realization;

public class MainClass {

	public static void main(String[] args) {
		
		Realization realization = new Realization();
		
		String hello = realization.combineStr("안녕", "하세요");
		System.out.println(hello);
		
		int multiply = realization.multiplyInt(5, 4);
		System.out.println(multiply);
		
		boolean isEqual = realization.equalStr(hello, "Hello");
		System.out.println(isEqual);
	}

}
