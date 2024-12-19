package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		
		File dir = new File("C:\\test\\sub");
		File file = new File(dir, "애국가1.dat");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			byte[] byteArr = new byte[(int)file.length()];
			int data = 0;
			int index = 0;
			while(true) {
				data = fis.read();
				if(data == -1) break;
				byteArr[index++] = (byte)data;
			}
			String str = new String(byteArr);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
