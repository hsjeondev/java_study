package com.gn;

import java.util.Objects;

public class CharNumber implements Comparable<CharNumber> {
	
	private char alphabet;
	private int number;
	
	public CharNumber() {}
	
	public CharNumber(char alphabet, int number) {
		this.alphabet = alphabet;
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(alphabet, number);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof CharNumber) {
			CharNumber person = (CharNumber)obj;
			if(this.alphabet == person.alphabet && this.number == person.number) {
				result = true;
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return this.alphabet + " : " + this.number;
	}

	@Override
	public int compareTo(CharNumber o) {
		return (int)this.alphabet - (int)this.alphabet;
	}
}
