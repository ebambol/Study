package com.java.test1;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			System.out.println(e.getMessage());	//Returns:the detail message string of this Throwable instance (which may be null).
			e.printStackTrace();
		}
	}

}
