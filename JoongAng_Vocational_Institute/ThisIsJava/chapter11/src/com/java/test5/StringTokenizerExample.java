package com.java.test5;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();	//남은 토큰수 int리턴
		for (int i= 0 ; i<countTokens; i++) {
			String token = st.nextToken();	//토큰을 하나씩 꺼내옴
			System.out.println(token);
		}
		
		System.out.println();
		
		//남아 있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {	//token이 남은지 확인 true/false
			String token = st.nextToken();	//토큰을 하나씩 꺼내옴
			System.out.println(token);
		}
	}

}
