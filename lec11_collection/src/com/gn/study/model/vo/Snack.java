package com.gn.study.model.vo;

import java.util.Objects;

public class Snack {
	
	private String flavor;
	private int calory;
	
	public Snack() {}
	
	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "[" + "맛=" + flavor + ", 칼로리=" + calory + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(flavor, calory);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Snack) {
			Snack other = (Snack)obj;
			if(this.flavor.equals(other.flavor) && this.calory == other.calory) {
				result = true;				
			}
		}
		
		return result;
	}
	
}
