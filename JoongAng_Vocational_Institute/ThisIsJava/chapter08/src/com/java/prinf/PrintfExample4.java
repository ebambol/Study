package com.java.prinf;

public class PrintfExample4 {

	public static void main(String[] args) {
		String p = "Java";
		String p2 = "JAVA";
		int age = 77;

		//s �ҹ��� / S �빮��
		System.out.printf("[%10s] %n", p);
		System.out.printf("[%-10s] %n", p);
		System.out.printf("[%-10S] %n", p);		//�ҹ��� -> �빮�� (o)
		System.out.printf("[%-10s] %n", p2);	//�빮�� -> �ҹ��� (x)
		System.out.printf("[%-10.2s] %n", p);	//2�ڸ� ���
		System.out.println();

		System.out.printf("���� ���:%f%n", 123.2);
		System.out.printf("���� ���:%f%n", 1.23);
		System.out.printf("���� ���:%f%n", 1.234);
		System.out.printf("���� ���:%f%n", 1.235);
		System.out.println();

		System.out.printf("���� ���:[%7.2f]%n", 123.2);
		System.out.printf("���� ���:[%7.2f]%n", 1.23);
		System.out.printf("���� ���:[%7.2f]%n", 1.234);
		System.out.printf("���� ���:[%7.2f]%n", 1.235);
		System.out.println();

		System.out.printf("���� ���:%7.2f%n", 123.2);
		System.out.printf("���� ���:%07.2f%n", 1.23);
		System.out.printf("���� ���:%-7.2f%n", 1.234);
		System.out.printf("���� ���:%7.2f%n", 1.235);
		System.out.println();
	}

}
