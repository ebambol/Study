package com.java.test3;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		//필드
		String str1 = "홍길동";
		String str2 = null;
		System.out.println("[isNull]");
		System.out.println(Objects.isNull(str1));		//false
		System.out.println(Objects.isNull(str2)+"\n");	//true
		
		System.out.println("[nonNull]");
		System.out.println(Objects.nonNull(str1));		//true
		System.out.println(Objects.nonNull(str2)+"\n");	//false
		
		System.out.println("[requireNonNull]");
		System.out.println(Objects.requireNonNull(str1));
//		System.out.println(Objects.requireNonNull(str2));	//java.lang.NullPointerException
		
		try {
			String strName = Objects.requireNonNull(str2);
		} catch (Exception e) {
			System.out.println(e.getMessage());	//null
//			e.printStackTrace();	//java.lang.NullPointerException
		}
		
		try {
			String strName = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());	//이름이 없습니다.
		}
		
		try {
			String strName = Objects.requireNonNull(str2, ()->"이름이 Null");	//람다식
		} catch (Exception e) {
			System.out.println(e.getMessage());	//이름이 Null
		}
	}

}
