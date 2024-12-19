package com.gn.study;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufInputRun {

	public static void main(String[] args) {
		
		File dir = new File("C:\\test\\sub\\241219");
		File file = new File(dir, "sample3.dat");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] arr = new byte[(int)file.length()];
			byte[] size = new byte[3];
			int index = 0;
			while(true) {
				int data = bis.read(size);
				if(data == -1) break;
				System.arraycopy(size, 0, arr, index, data);
				index += data;
			}
			String str = new String(arr);
			System.out.println(str);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
