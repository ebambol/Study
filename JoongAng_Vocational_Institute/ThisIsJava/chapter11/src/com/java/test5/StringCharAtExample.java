package com.java.test5;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {
		
		String ssn = "010624-1231230";
		char sex = ssn.charAt(7);
		//���� index7���� ���� �ʴ� ���ڿ��̸� �����߻�
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		switch (sex) {
		case '1':
		case '3':
			System.out.println("����");
			break;
		case '2':
		case '4':
			System.out.println("����");
			break;
		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("�Է� > ");
//		String a = scanner.next();
//		char sex = a.charAt(7);
//		//���� index7���� ���� �ʴ� ���ڿ��̸� �����߻�
//		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
//		switch (sex) {
//		case '1':
//		case '3':
//			System.out.println("����");
//			break;
//		case '2':
//		case '4':
//			System.out.println("����");
//			break;
//		default:
//			System.out.println("Ʋ��");
//		}
	}

}
