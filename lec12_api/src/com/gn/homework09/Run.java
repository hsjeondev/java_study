package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		Date date = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : " + sdf.format(date));
		
		Calendar openDay = Calendar.getInstance();
		openDay.set(2025, 1-1, 24, 10, 00, 00);
		long diff = openDay.getTimeInMillis() - today.getTimeInMillis();
		diff /= 1000;
		diff /= 24*60*60;
		System.out.println("카페 오픈일까지 남은 날 : " + diff + "일");
		System.out.println("오픈달의 마지막 날 : " + openDay.getActualMaximum(Calendar.DAY_OF_MONTH) + "일");
		
		date = openDay.getTime();
		sdf = new SimpleDateFormat("E요일");
		System.out.println("카페 오픈일의 요일 : " + sdf.format(date));

	}

}
