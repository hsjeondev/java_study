package com.gn.study;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufReaderRun {

	public static void main(String[] args) {
		
		File file = new File("C:\\test\\sub\\sample2.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			// 읽을 단위 지정
			// StringBuilder
			StringBuilder sb = new StringBuilder();
			// while문
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				sb.append(data).append("\n");
			}
			// 출력
			System.out.println(sb.toString());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();;
			} catch (IOException e) {
				e.printStackTrace();

			}

		}

	}
}

