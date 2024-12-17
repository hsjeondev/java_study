package com.gn.Practice06;

public class Practice {

	public String strChange(StringBuilder str) {
		
		String deleteStr = " TO";
		
		str.append("!");
		str.insert(0, "<< ");
		int index = str.indexOf(deleteStr);
		str.delete(index, index+deleteStr.length());
		str.reverse();
		
		return str.toString();
	}
	
}
