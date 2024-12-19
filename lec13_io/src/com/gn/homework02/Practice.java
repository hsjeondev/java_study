package com.gn.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Practice {

	public long method1(String path) {
		long start = System.nanoTime();
		
		File file = new File(path);
		
		try(FileInputStream fis = new FileInputStream(file)) {
			
			byte[] bytes = new byte[(int)file.length()];
			byte[] size = new byte[1000];
			int index = 0;
			while(true) {
				int data = fis.read(size);
				if(data == -1) break;
				System.arraycopy(size, 0, bytes, index, data);
				index += data;
			}
			
			System.out.println(new String(bytes));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		return end - start;
	}
	
	public long method2(String path) {
		long start = System.nanoTime();
		
		File file = new File(path);
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
			
			byte[] bytes = new byte[(int)file.length()];
			byte[] size = new byte[1000];
			int index = 0;
			while(true) {
				int data = bis.read(size);
				if(data == -1) break;
				System.arraycopy(size, 0, bytes, index, data);
				index += data;
			}
			System.out.println(new String(bytes));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		return end - start;
	}
}
