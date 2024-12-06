package com.gn.practice01.run;

import com.gn.practice01.model.vo.Manager;

public class Run {
	
	public static void main(String[] args) {
		
		Manager manager = new Manager("김철수" , "영업부");
		
		manager.printDeaprtment();
		
	}
	
}