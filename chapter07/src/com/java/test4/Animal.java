package com.java.test4;

public abstract class Animal {	//�߻�Ŭ����
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();	//�߻�޼ҵ�(�̿ϼ�, ���� ����)
}
