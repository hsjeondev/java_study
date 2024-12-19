package com.gn.study;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterRun {

	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false)  {
			dir.mkdirs();	
		}
		// 2. 파일 객체 생성
		File file = new File(dir, "sample1.txt");
		// 3. 텍스트 파일 출력 스트림 선언
		FileWriter fw = null;
		// 4. 파일 출력 스트림 생성
		try {
			fw = new FileWriter(file);
			// 5. 출력할 데이터 구성 -> int, char[], String
			int num = '대';
			char[] arr = {'한', '민'};
			String str = "국";
			
			// 6. 출력
			fw.write(num);
			fw.write(arr);
			fw.write(str);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
