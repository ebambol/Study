package com.java.test5;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println("��ҹ��� ���� : " + str1.equals(str2));	//false(��ҹ��� ����)
		
		String lowerStr1 = str1.toLowerCase();	//str1��ü �ҹ��� ��ȯ
		String lowerStr2 = str2.toLowerCase();	//str2��ü �ҹ��� ��ȯ
		
		System.out.println("lowerStr1: " + lowerStr1);
		System.out.println("lowerStr2: " + lowerStr2);
		
		System.out.println("�ҹ��� �� : " + lowerStr1.equals(lowerStr2));	//true
		
		String UpperStr1 = str1.toUpperCase();
		String UpperStr2 = str2.toUpperCase();
		
		System.out.println("UpperStr1: " + UpperStr1);
		System.out.println("UpperStr2: " + UpperStr2);
		
		System.out.println("��ҹ��� ���о���: " + str1.equalsIgnoreCase(str2));	//true (��ҹ��� ���о���)
	}

}
