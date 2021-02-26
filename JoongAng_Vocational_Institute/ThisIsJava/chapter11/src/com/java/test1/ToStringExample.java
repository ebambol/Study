package com.java.test1;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();	//밀리초까지 
		Date obj3 = new Date(50000);	//1970-01-01 부터 long값 만큼 더한 날짜 (밀리초임)
		
		System.out.println(obj1);	//오버라이딩(x)
		//java.lang.Object@15db9742
		System.out.println(obj2);	//오버라이딩(o)
		//Fri Feb 26 12:10:14 KST 2021
		System.out.println(obj3);
		//Thu Jan 01 09:00:50 KST 1970
	}

}
