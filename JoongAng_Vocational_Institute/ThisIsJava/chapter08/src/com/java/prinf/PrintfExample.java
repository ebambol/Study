package com.java.prinf;

public class PrintfExample {

	public static void main(String[] args) {
		int age = 77;
		String addr = "��⵵";
		float f = 1.2345f;
		double d = 3.14;
		char c = 'a';
		boolean b = true;
		System.out.printf("%d�⵵ �� ���̴� %d�Դϴ�.%n", 2021,age);
		System.out.printf("���� %s�� ��� �־��%n", addr);
		System.out.printf("�Ҽ��� ����� %f , %f %n", f,d);
		System.out.printf("10�� 8������ ǥ��  = %o %n", age);
		System.out.printf("10�� 8������ ǥ��  = %X, %x %n", age,age);
		System.out.printf("���ĺ��� ������ %c ����%n", c);
		System.out.printf("���ΰ� �����ΰ� ������: %b %B%n",b,b);
		System.out.printf("%e%n",123.456);
		System.out.printf("%.2e%n",123.456);
	}

}
