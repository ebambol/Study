package com.java.test4;

public class Outter {
	//Outter �ν��Ͻ� �ʵ�
	String field = "Outter-field";
	//Outter �ν��Ͻ� �޼ҵ�
	void method() {
		System.out.println("Outter-method()");
	}
	
	//Nested ��øŬ����
	class Nested {
		//Nested �ν��Ͻ� �ʵ�
		String field = "Nested-field";
		//Nested �ν��Ͻ� �޼ҵ�
		void method() {
			System.out.println("Nested-method()");
		}
		void print() {
			//��ø Ŭ����(Nested)�� ��ü ����
			System.out.println(this.field);
			this.method();

			//�ܺ�Ŭ���� (Outter)�� ��ü ����
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
