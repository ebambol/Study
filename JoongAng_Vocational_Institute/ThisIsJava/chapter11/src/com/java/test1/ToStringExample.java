package com.java.test1;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();	//�и��ʱ��� 
		Date obj3 = new Date(50000);	//1970-01-01 ���� long�� ��ŭ ���� ��¥ (�и�����)
		
		System.out.println(obj1);	//�������̵�(x)
		//java.lang.Object@15db9742
		System.out.println(obj2);	//�������̵�(o)
		//Fri Feb 26 12:10:14 KST 2021
		System.out.println(obj3);
		//Thu Jan 01 09:00:50 KST 1970
	}

}
