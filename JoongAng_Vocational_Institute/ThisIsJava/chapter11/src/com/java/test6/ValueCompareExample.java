package com.java.test6;

public class ValueCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		//����Ŭ���� ��ü�� ���� ��
		//UnBoxing�� �� �� ���ϰų� equals() �޼ҵ带 ����ؼ� ��
		System.out.println("[-128~127 �ʰ����� ���]");
		System.out.println("==���: " + (obj1==obj2) );	//false
		System.out.println("��ڽ� �� ==���: " + (obj1.intValue() == obj2.intValue()) );	//true
		System.out.println("equals() ���: " + obj1.equals(obj2));//true
		System.out.println();
		
		System.out.println("[-128~127 �������� ���]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==���: " + (obj3==obj4) );	//true
		System.out.println("��ڽ� �� ==���: " + (obj3.intValue() == obj4.intValue()) );	//true
		System.out.println("equals() ���: " + obj3.equals(obj4));//true
	}

}
