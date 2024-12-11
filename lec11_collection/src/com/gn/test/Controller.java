package com.gn.test;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	private List<String> list = new ArrayList<String>();
	
	public void insertItem2(String item) {
		list.add(item);
		System.out.println(item);
	}
}
