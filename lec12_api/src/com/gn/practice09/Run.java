package com.gn.practice09;

import java.util.Calendar;

public class Run {

	public static void main(String[] args) {
		
		Calendar beginOfYear = Calendar.getInstance();
		beginOfYear.set(2024, 1-1, 1);
		
		Calendar today = Calendar.getInstance();
		
		long diff = today.getTimeInMillis() - beginOfYear.getTimeInMillis();
		diff /= 1000;
		diff /= (24 * 60 * 60);
		
		System.out.printf("1월 1일부터 %d월 %d일까지 %d일이 지났습니다.", today.get(Calendar.MONTH)+1, today.get(Calendar.DAY_OF_MONTH), diff );

	}

}
