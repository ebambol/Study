package com.java.junit;

public class Num {
	//�ʵ�
	private int value;

	//������
	public Num (int value) {
		this.value = value;
	}

	//�޼ҵ�
	//���ϱ� (�����ϱ�)
	public int add(int rhs) {
		return this.value += rhs;
	}

	//����
	public int subtract (int rhs) {
		return this.value -= rhs;
	}

	//���ϱ�
	public int multiply (int rhs) {
		return this.value *= rhs;
	}

	//������
	public int divide (int rhs) {
		return this.value /= rhs;
	}

	//�ʵ尪 �ϱ�
	public int getValue() {
		return this.value;
	}
}