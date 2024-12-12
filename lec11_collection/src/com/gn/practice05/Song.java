package com.gn.practice05;

import java.util.Objects;

public class Song {
	
	private String name;
	private String singer;
	
	public Song() {}
	
	public Song(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Song) {
			Song other = (Song)obj;
			if(this.name.equals(other.name) && this.singer.equals(other.singer)) {
				result = true;
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "{제목=" + name + ",가수=" + singer + "}";
	}
 }
