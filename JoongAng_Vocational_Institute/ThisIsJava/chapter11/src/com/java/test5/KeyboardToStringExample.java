package com.java.test5;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException  {
		//읽을 바이트를 저장할 공간
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");	//0123456 으로 고정
		int readByteNo = System.in.read(bytes);	//배열에 읽은 바이트를 저장하고 읽은 바이트수를 리턴
		System.out.println("bytes.length: " + bytes.length);	//bytes.lenght: 100
		System.out.println("readByteNo : " + readByteNo);	//readByteNo : 9
		/*
		int sum=0;
		for(int i=0; i<bytes.length; i++) {
			if(bytes[i]>0) { sum+=1; }
		}
		System.out.println("입력된 총 bytes: " + sum);	//입력된 총 bytes: 9
		 */
		
		String str1 = new String(bytes, 0, readByteNo-2);	//입력: 0123456 출력 : 0123456
		String str2 = new String(bytes, 0, readByteNo);		//입력: 0123456 출력 : 0123456 ,bytes.length() : 9
		String str3 = new String(bytes, 3, readByteNo-2);	//입력: 0123456 출력 : 3456 
		//배열을 문자열로 변환
		System.out.println("str1 : "+ str1);
		System.out.println("str2 : "+ str2+","+"bytes.length() : "+str2.length());
		System.out.println("str3 : "+ str3);
		try {
			//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -3
			String str4 = new String(bytes, -3, readByteNo-2);	//str4는 배열 범위를 넘어갔습니다.
			System.out.println(str4);
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("str4는 배열 범위를 넘어갔습니다.");
		}
	}

}
