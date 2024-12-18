package com.gn.practice01;

import java.io.File;

public class Practice {

	public void deleteFile(File[] files) {
		for(File file : files) {
			if(file.exists() && file.isFile()) {
				if(file.delete()) {
					System.out.println(file.getName() + " 파일 삭제");
				} else {
					System.out.println(file.getName() + " 파일 삭제 실패");
				}
			} else if(file.isFile()){
				System.out.println("해당 이름의 파일이 없음");
			} else {
				System.out.println(file.getName() + "은(는) 디렉토리");
			}
		}
	}
}
