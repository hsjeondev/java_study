package com.gn.practice07.model.vo;

import java.util.Objects;

public class Equipment {
	
	private String name;
	private int pricePerDay;
	
	public Equipment() {}
	
	public Equipment(String name, int pricePerDay) {
		this.name = name;
		this.pricePerDay = pricePerDay;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, pricePerDay);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Equipment) {
			Equipment other = (Equipment)obj;
			if(this.name.equals(other.name) && this.pricePerDay == other.pricePerDay) {
				result = true;				
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "- " + name + " : " + pricePerDay + "원";
	}
 }
