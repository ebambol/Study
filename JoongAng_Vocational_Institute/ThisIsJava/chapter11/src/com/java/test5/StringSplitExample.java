package com.java.test5;

public class StringSplitExample {
	public static void main(String[] args) {
//		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
//		String[] names = text.split("&|,|-");
		String text = "ȫ�浿,�̼�ȫ,�ڿ���,���ڹ�,�ָ�ȣ";
		String[] names = text.split(",");

		System.out.println("�迭�� ���� : " + names.length);
		for(String name : names) {
			System.out.println(name);
		}

	}

}
