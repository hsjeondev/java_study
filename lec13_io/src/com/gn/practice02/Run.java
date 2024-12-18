package com.gn.practice02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Run {

	public static void main(String[] args) {
		
		File dir = new File("C:\\test\\sub");
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");
		File file = new File(dir, uuid + ".txt");
		try {
			if(!file.exists()) {
				if(file.createNewFile()) {
					System.out.println("파일 정상 생성");
				} else {
					System.out.println("파일 생성 실패");
				}
			} else {
				System.out.println("같은 이름의 파일이 존재함. 대박 로또 사러 ㄱㄱ");
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
