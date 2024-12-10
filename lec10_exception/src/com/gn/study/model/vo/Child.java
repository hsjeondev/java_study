package com.gn.study.model.vo;

public class Child extends Parent {
	
	@Override
	public void method() 
//			throws IllegalArgumentException 같은 것 됨
//			throws Exception 확장 안 됨
			throws NullPointerException // 같은 계층 됨
	{
		System.out.println("Child");
	}
}
