package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun1 {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		if(dir.exists()) {
			dir.mkdirs();
		}
		
		// 2. 파일 생성
		File file = new File(dir, "sample.dat");
		// 3. fileOutoutStream 생성
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			// 4. 출력할 데이터 구성
			String str = "hello";
			byte[] arr = str.getBytes();
			// 5. 출력
			out.write(arr);
			// 6. 플러싱(선택)
			out.flush();
			System.out.println(file.length()+"크기의 " +file.getParent() + " 파일 생성");
			
			
			
		// FileNotFoundException은 IOException의 자식이어서 생략 가능
//		} catch(FileNotFoundException e) { // FileOutputStream의 예외
//			e.printStackTrace();
		} catch(IOException e) { // out.write의 예외
			e.printStackTrace();
		} finally {
			// 7. 스트림 닫기
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
