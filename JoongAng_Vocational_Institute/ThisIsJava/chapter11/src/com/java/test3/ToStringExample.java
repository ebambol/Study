package com.java.test3;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));	//ȫ�浿
		System.out.println(Objects.toString(str2));	//null
		System.out.println(Objects.toString(str2,"�̸��� �����ϴ�."));	//�̸��� �����ϴ�.
	}

}
