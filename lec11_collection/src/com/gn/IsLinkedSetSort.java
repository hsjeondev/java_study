package com.gn;

import java.util.*;


public class IsLinkedSetSort {

	public static void main(String[] args) {
		Set<CharNumber> chars = new HashSet<CharNumber>();
		
		chars.add(new CharNumber('a', 1));
		chars.add(new CharNumber('b', 2));
		chars.add(new CharNumber('c', 3));
		chars.add(new CharNumber('d', 4));
		chars.add(new CharNumber('e', 5));
		chars.add(new CharNumber('f', 6));
		chars.add(new CharNumber('g', 7));
		chars.add(new CharNumber('h', 8));
		chars.add(new CharNumber('i', 9));
		chars.add(new CharNumber('j', 10));
		System.out.println(chars);
		
		chars = new LinkedHashSet<CharNumber>(chars);
		System.out.println(chars);
		
	}
}
