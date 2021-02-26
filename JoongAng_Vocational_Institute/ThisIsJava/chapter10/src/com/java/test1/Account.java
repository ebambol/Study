package com.java.test1;

public class Account {
	//�ʵ�
	private long balance;
	
	//������
	public Account() { }
	
	//�޼ҵ�
	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ����:" + (money-balance)+ " ���ڶ�");
		}
		balance -= money;
	}
}
