package com.java.test5;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println("oldStr: " + oldStr);
		System.out.println("newStr: " + newStr);
	}

}
