package com.java.test5;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException  {
		//���� ����Ʈ�� ������ ����
		byte[] bytes = new byte[100];
		
		System.out.print("�Է� : ");	//0123456 ���� ����
		int readByteNo = System.in.read(bytes);	//�迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ���� ����
		System.out.println("bytes.length: " + bytes.length);	//bytes.lenght: 100
		System.out.println("readByteNo : " + readByteNo);	//readByteNo : 9
		/*
		int sum=0;
		for(int i=0; i<bytes.length; i++) {
			if(bytes[i]>0) { sum+=1; }
		}
		System.out.println("�Էµ� �� bytes: " + sum);	//�Էµ� �� bytes: 9
		 */
		
		String str1 = new String(bytes, 0, readByteNo-2);	//�Է�: 0123456 ��� : 0123456
		String str2 = new String(bytes, 0, readByteNo);		//�Է�: 0123456 ��� : 0123456 ,bytes.length() : 9
		String str3 = new String(bytes, 3, readByteNo-2);	//�Է�: 0123456 ��� : 3456 
		//�迭�� ���ڿ��� ��ȯ
		System.out.println("str1 : "+ str1);
		System.out.println("str2 : "+ str2+","+"bytes.length() : "+str2.length());
		System.out.println("str3 : "+ str3);
		try {
			//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -3
			String str4 = new String(bytes, -3, readByteNo-2);	//str4�� �迭 ������ �Ѿ���ϴ�.
			System.out.println(str4);
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("str4�� �迭 ������ �Ѿ���ϴ�.");
		}
	}

}
