package com.java.test4;

public class Dog extends Animal{
	//������
	public Dog() {
		this.kind = "������";
	}

//	�������̵� ���� ������ �ߴ� ����	The type Dog must implement the inherited abstract method Animal.sound()
	@Override
	public void sound() {
		System.out.println("�۸�");	//�߻�޼ҵ� ������
	}
}
