package com.java.prinf;


public class PrintfExample2 {

	public static void main(String[] args) {
		int age = 77;
		System.out.printf("���� ���:%d%n", 1);
		System.out.printf("���� ���:%d%n", 10);
		System.out.printf("���� ���:%d%n", 100);
		System.out.printf("���� ���:%d%n", 1000);

		System.out.printf("���� ���:%5d %n", 1);
		System.out.printf("���� ���:%5d %n", 10);
		System.out.printf("���� ���:%5d %n", 100);
		System.out.printf("���� ���:%5d %n", 1000);

		//����������
		System.out.printf("���� ���:%5d %5d %n", 1,2);
		System.out.printf("���� ���:%5d %5d %n", 10,20);
		System.out.printf("���� ���:%5d %5d %n", 100,200);
		System.out.printf("���� ���:%5d %5d %n", 1000,2000);

		//��������(-)
		System.out.printf("���� ���:%-5d %-5d %n", 1,2);
		System.out.printf("���� ���:%-5d %-5d %n", 10,20);
		System.out.printf("���� ���:%-5d %-5d %n", 100,200);
		System.out.printf("���� ���:%-5d %-5d %n", 1000,2000);

		//0���� ä���
		System.out.printf("���� ���:%05d %05d %n", 1,2);
		System.out.printf("���� ���:%05d %05d %n", 10,20);
		System.out.printf("���� ���:%05d %05d %n", 100,200);
		System.out.printf("���� ���:%05d %05d %n", 1000,2000);
	}

}