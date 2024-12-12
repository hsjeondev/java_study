package com.gn.homework02;

import java.util.Objects;

public class Lottery implements Comparable<Lottery> {

	private String name;
	private String phone;
	
	public Lottery() {}

	public Lottery(String name, String phone) {
	    this.name = name;

	    String cleanNumber = "";
	    for (int i = 0; i < phone.length(); i++) {
	        char ch = phone.charAt(i);
	        if (ch != '-' && ch != ' ') {
	        	cleanNumber += ch;
	        }
	    }
	    
	    this.phone = cleanNumber;
	    
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "[이름 : " + name + ", 휴대폰 번호=" + phone + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Lottery) {
			Lottery lottery = (Lottery)obj;
			if(this.name.equals(lottery.name) && this.phone.equals(lottery.phone)) {
				result = true;
			}
		}
	
		return result;
	}
	
	@Override
	public int compareTo(Lottery l) {
		if(this.name.compareTo(l.name) == 0) {
			return this.phone.compareTo(l.phone);
		} else {
			return this.name.compareTo(l.name);
		}
	}
}
