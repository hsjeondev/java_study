package com.gn.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputRun2 {
	public static void main(String[] args) {
		// 1. 디렉토리 지정
		File dir = new File("C:\\test\\sub\\241219");
		// 2. 파일 지정
		File file = new File(dir, "sample3.dat");
		// 3. 파일 입력 스트림 선언
		FileInputStream fis = null;
		
		try {
			// 4. 파일 입력 스트림 생성
			fis = new FileInputStream(file);
			// 5. 읽은 데이터 저장할 배열
			byte[] b = new byte[(int)file.length()];
			// 6. 읽을 단위 나타낼 배열
			byte[] stand = new byte[5];
			// 7. 읽어오기
			int idx = 0;
			while(true) {
				int data = fis.read(stand);
				if(data == -1) break;
				System.arraycopy(stand, 0, b, idx, data);
				idx += data;
			}
			// 8. 확인하기
			String str = new String(b);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 9. 스트림 닫기
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
