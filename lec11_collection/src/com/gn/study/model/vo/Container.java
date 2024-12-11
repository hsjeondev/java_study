package com.gn.study.model.vo;

public class Container<T> {
	private T item;

	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}
