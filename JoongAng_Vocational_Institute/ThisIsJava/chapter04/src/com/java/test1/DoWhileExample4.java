package com.java.test1;

import java.util.Scanner;

public class DoWhileExample4 {

	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		//Scanner ��ü -> scanner ��ü ���� ����
		Scanner scanner = new Scanner(System.in);

		int inputString1;
		int inputString2;
		do {
			System.out.print("input Data 1>");
			inputString1 = scanner.nextInt();
			System.out.print("input Data 2>");
			inputString2 = scanner.nextInt();

			System.out.println("result1 :" + inputString1);
			System.out.println("result2 :" + inputString2);
			System.out.println("result3 :" + (inputString1 + inputString2));
		}
		//��ҹ��� ���� x
		while (!(inputString1 == -1));
		//��ҹ��� ���� o
//		while (!inputString1.equalsIgnoreCase("q"));
		System.out.println();
		System.out.println("���α׷� ����");
		
	}

}
