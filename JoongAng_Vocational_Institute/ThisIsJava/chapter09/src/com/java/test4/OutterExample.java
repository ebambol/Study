package com.java.test4;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		
		Outter.Nested nest = outter.new Nested();	//�ν��Ͻ� ��� Ŭ���� ��ü ����
		nest.print();
	}

}
