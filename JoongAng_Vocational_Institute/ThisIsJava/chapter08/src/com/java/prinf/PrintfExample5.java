package com.java.prinf;

public class PrintfExample5 {

	public static void main(String[] args) {
		String name1 = "ȫ�浿";
		String name2 = "���ؾ�";
		//ȫ�浿 ����
		int kor1 = 100;
		int eng1 = 100;
		int mat1 = 100;
		//���� ����
		int kor2 = 30;
		int eng2 = 45;
		int mat2 = 20;
		//�հ�
		int sum1 = kor1 + eng1 + mat1;
		int sum2 = kor2 + eng2 + mat2;
		//���
		double avg1 = sum1/3.0; 
		double avg2 = sum2/3.0; 
		
		System.out.println("�̸�   |  ����    |   ����    |   ����   |   �հ�   |   ���");
		System.out.println(name1+" , "+kor1+" , "+eng1+" , "+mat1+" , "+sum1+" , "+avg1);
		System.out.println(name2+" , "+kor2+" , "+eng2+" , "+mat2+" , "+sum2+" , "+avg2);
		System.out.println();
		System.out.printf("%-6s_%-3s__%-3s__%-3s__%-3s__%-3s %n","�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("%-6s[%3d][%3d][%3d][%3d][%6.2f]%n", name1, kor1, eng1, mat1, sum1, avg1);
		System.out.printf("%-6s[%3d][%3d][%3d][%3d][%6.2f]%n", name2, kor2, eng2, mat2, sum2, avg2);
		
		System.out.println();
		//s �ҹ��� / S �빮��
//		System.out.printf("[%10s] %n", p);
//		System.out.printf("[%-10s] %n", p);
//		System.out.printf("[%-10S] %n", p);		//�ҹ��� -> �빮�� (o)
//		System.out.printf("[%-10s] %n", p2);	//�빮�� -> �ҹ��� (x)
//		System.out.printf("[%-10.2s] %n", p);	//2�ڸ� ���
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