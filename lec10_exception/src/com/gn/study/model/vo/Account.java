package com.gn.study.model.vo;

public class Account {
	private String user;
	private int balance;
	
	public Account() {}
	
	public Account(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}
	
	// 직접 만든 예외클래스로 thorw하면 그 순간에 처리가 안 되어서 thorws를 해줘야 함.
	// 직접 만든 예외클래스를 던질 때 thorw와 throws가 세트
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount > balance) {

			throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
		balance -= amount;
		System.out.println(amount + "원이 출금됐습니다.");
	}
}
