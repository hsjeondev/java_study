package com.gn.study.field.model.vo;

public class Car {
	// 인스턴스 변수(필드)
	public static final String name = "avante";
	
	// 브랜드
	// public -> 본인, 같은 패키지, 후손, 전체
	public static String brand = "현대";
	// 색깔
	// protected -> 본인, 같은 패키지, 후손
	protected String color;
	// 가격
	// (default) -> 본인, 같은 패키지
	int price;
	// 제조년도
	// private -> 본인
	private int year;
	
	// 인스턴스 블록
	{year = 2024;}
	// 클래스 블록
	static {brand = "폭스바겐";}

}
