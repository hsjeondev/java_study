package com.gn.homework01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {

	public void method1(String song) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "나비야1.dat");
		
		try(FileOutputStream fos = new FileOutputStream(file)) {
			
			byte[] songBytes = song.getBytes();
			
			fos.write(songBytes);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method2(String song) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "나비야2.dat");
		
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
			byte[] songBytes = song.getBytes();
			
			bos.write(songBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
