package com.gn.homework03.model.vo;

public class Realization {
	
	
	public String combineStr(String first, String second) {
		return first + second;
	}
	
	public int multiplyInt(int first, int second) {
		if(first < second) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		} else {
			return first * second;
		}
	}
	
	public boolean equalStr(String first, String second) {
		if(first.equals(second)) {
			return true;
		} else {
			return false;
		}
	}
}
