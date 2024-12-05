package com.gn.homework10;

public class Main {

	public static void main(String[] args) {
		
		Account account1 = new Account("123-456-789", 100000);
		Account account2 = new Account("987-654-321", 50000);
		
		account1.withdraw(3000); // 출금
		account2.deposit(10000); // 입금
		
		Bank bank = new Bank();
		
		bank.transfer(account1, account2, 50000);
		
		System.out.println("계좌번호 123-456-789의 잔액 : " + account1.getBalance());
		System.out.println("계좌번호 987-654-321의 잔액 : " + account2.getBalance());

	}

}
