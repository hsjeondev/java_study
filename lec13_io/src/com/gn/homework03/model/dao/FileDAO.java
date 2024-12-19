package com.gn.homework03.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	private String path = "C:\\homework03_Files";

	public boolean checkName(String file) {
		boolean isExist = false;
		
		File dir = new File(path);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File checkFile = new File(dir, file);
		
		if(checkFile.exists()) {
			isExist = true;
		} else {
			isExist = false;
		}
		
		return isExist;
	}
	
	public void fileSave(String file, String s) {
		File userFile = new File(path, file);
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(userFile))) {
			
			bw.write(s);
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		File userFile = new File(path, file);
		
		StringBuilder sb = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(new FileReader(userFile))) {
			
			
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				sb.append(data).append("\n");
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		File userFile = new File(path, file);
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(userFile, true))) {
			
			bw.write(s);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
