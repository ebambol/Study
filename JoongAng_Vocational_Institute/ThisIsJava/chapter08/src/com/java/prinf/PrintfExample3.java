package com.java.prinf;

public class PrintfExample3 {

	public static void main(String[] args) {
		int age = 77;
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
