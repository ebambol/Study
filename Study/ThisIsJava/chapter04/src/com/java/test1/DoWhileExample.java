package com.java.test1;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		//Scanner ��ü -> scanner ��ü ���� ����
		Scanner scanner = new Scanner(System.in);

		String inputString;

		do {
			System.out.print(">");
			//nextLine() : ����ġ�� ������ ���ڿ� ����
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}
		//��ҹ��� ���� x
		while (!inputString.equals("q"));
		//��ҹ��� ���� o
//		while (!inputString.equalsIgnoreCase("q"));
		System.out.println();
		System.out.println("���α׷� ����");
		
	}

}
