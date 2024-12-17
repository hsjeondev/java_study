package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Run {

	public static void main(String[] args) {
		// 오늘 날짜를 기준으로 1주일 뒤에 날짜 정보를 출력
		// OO월 OO일 OO요일
		
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DAY_OF_MONTH, 7);
		Date date = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(date));
		
		// 웬만하면 변수 새로 만들어서 하는 것을 추천. 오작동 확률이 줄음
		today = Calendar.getInstance();
		today.add(Calendar.MONTH, 1); // 필드를 누구로 설정했느냐에 따라서 다음으로 이동. 자동으로 2025년으로 넘어간 것
		date = today.getTime();
		System.out.println(sdf.format(date));

	}

}
