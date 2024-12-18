package com.gn.study;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class FileRun {

	public static void main(String[] args) {
		// 1. 디렉토리 생성
		// (1) File 객체 선언
//		File dir1;
		// (2) File 객체 생성
//		dir1 = new File("C:\\exampleDir");
		// (3) 디렉토리 생성
//		dir1.mkdir();
		
		File dir2 = new File("C:\\parentDir\\childDir");
		dir2.mkdirs();
		
		// 2. 디렉토리 삭제
		// (1) File 객체 선언 및 생성
//		File path1 = new File("C:\\exampleDir");
		// (2) delete() 메소드 호출
//		path1.delete();
		
//		File path2 = new File("C:\\parentDir\\childDir");
//		File path2 = new File("C:\\parentDir");
//		path2.delete();
		
		// 3. 디렉토리 존재 유무 확인
		File dir3 = new File("C:\\testDir");
		
//		if(!dir3.exists()) {
//			if(dir3.mkdirs()) {
//				System.out.println("정상 생성");
//			} else {
//				System.out.println("실패");
//			}
//		} else {
//			System.out.println("이미 존재하는 경로");
//		}
		
//		if(dir3.exists()) {
//			if(dir3.delete()) {
//				System.out.println("정상 삭제");
//			} else {
//				System.out.println("실패");
//			}
//		}
		
//		if(dir3.exists()) {
//			dir3.delete();
//		} else {
//			dir3.mkdirs();
//		}
		
		// 4. 파일 생성
		File dir1 = new File("C:\\\\parentDir\\\\childDir");
		File file1 = new File("C:\\parentDir\\childDir\\example.txt");
//		
//			try {
//				if(!dir1.exists()) {
//					dir1.mkdirs();
//				}
//				if(file1.createNewFile()) {
//					System.out.println("파일 생성 성공");
//				} else {
//					System.out.println("파일 생성 실패");
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
		// 5. 파일 삭제
//		if(file1.exists()) {
//			if(file1.delete()) {
//				System.out.println("삭제 성공");
//			} else {
//				System.out.println("삭제 실패");
//			}
			
			// 6. 파일, 디렉토리 정보 확인
			// (1) 배열 : listFiles()
			File testDir = new File("C:\\test\\sub");
			File[] files = testDir.listFiles();
			for(File file : files) {
				System.out.println(file);
			}
			// (2) 유형 확인
			File test = new File("C:\\test\\sub\\test1.txt");
			if(test.isDirectory()) System.out.println("디렉토리!!");
			if(test.isFile()) System.out.println("파일~");
			if(test.exists()) {
				if(test.isFile()) System.out.println("진짜 파일");
			}
			String type = test.isDirectory() ? "디렉토리" : "파일";
			System.out.println(type);
			
			// (3) 부모 확인
			System.out.println(test.getParent());
			
			// (4) 이름 확인
			System.out.println(test.getName());
			
			// (5) 경로 확인
			System.out.println(test.getPath());
			
			// (6) 마지막 수정 날짜
			long millis = test.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(millis);
			System.out.println(date);
			
			long byte1 = test.length();
			System.out.println(byte1/1024.0);
			double kbSize = byte1/1024.0;
			double result = Math.round(kbSize*10) / 10.0;
			System.out.println(result);
			
			UUID rnd = UUID.randomUUID();
			System.out.println(rnd.toString());
			
			// 7. UUID와 파일명
			File dir = new File("C:\\test\\sub");
			String uuid = UUID.randomUUID().toString();
			File file = new File(dir, uuid+".dat");
			try { 
				if(!file.exists()) {
					file.createNewFile();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}


