package com.java.test1;

public class Account {
	//필드
	private long balance;
	
	//생성자
	public Account() { }
	
	//메소드
	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족:" + (money-balance)+ " 모자람");
		}
		balance -= money;
	}
}
