package com.java.test4;

public class Car {
	//�ʵ�
	public String name;
	public int price;
	
	//������
	public Car() { }
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//�޼ҵ�
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}
	
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}
}
