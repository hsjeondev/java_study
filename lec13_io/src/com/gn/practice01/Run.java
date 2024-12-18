package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;

public class Run {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		int year = today.getYear();
		int Month = today.getMonth().getValue();
		int day = today.getDayOfMonth();
		
		String dirPath = "C:\\test\\sub\\" + year + "\\" + Month + "\\" + day;
		
		File dir = new File(dirPath);
		
		if(!dir.exists()) {
			if(dir.mkdirs()) {
				System.out.println("디렉토리 생성 성공");
			} else {
				System.out.println("디렉토리 생성 실패");
			}
		} else {
			System.out.println("이미 존재하는 디렉토리");
		}

		File dir2 = new File("C:\\test\\sub");
		File[] dirs = dir2.listFiles();
		Practice practice = new Practice();
		practice.deleteFile(dirs);
	}

}
