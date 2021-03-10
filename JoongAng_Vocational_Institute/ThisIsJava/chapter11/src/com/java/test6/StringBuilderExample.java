package com.java.test6;

public class StringBuilderExample {
	public static void main(String[] args) {
		//버퍼 크기 지정
		StringBuilder sb = new StringBuilder(50);
		
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb.toString());	//Java Program Study
		System.out.println(sb);	//Java Program Study
		//sb[5]의 위치부터 새 문자열로 만듬
		System.out.println("새 문자열 : " + sb.substring(5));	//Program Study
		//버퍼크기
		System.out.println("버퍼 크기 : " + sb.capacity());	//50
		//문자열 길이
		System.out.println("문자열 길이 : " + sb.length());	//18
		//"P"의 인덱스 위치
		System.out.println("P의 인덱스 위치 : " +sb.indexOf("P"));	//5
		//sb[4]에 123추가
		System.out.println("index[4]에 123 추가 : " + sb.insert(4, 123));	//Java123 Program Study
		//sb[4]부터 21까지 삭제
		System.out.println("index[5]부터 [21]까지 삭제 : " + sb.delete(5, 21));	//Java1
		//sb[4] 문자 삭제
		System.out.println("index[4]문자 삭제 : " + sb.deleteCharAt(4));	//Java
		//sb[4]부터 [30]까지 공간에 " book" 추가
		System.out.println("index[4]부터 [30]공간에 book 추가 : " + sb.replace(4, 30, " book"));	//Java book
		//"k"부터 처음까지 인덱스 갯수
		System.out.println("k부터 처음까지 index 갯수 : " + sb.lastIndexOf("k"));	//8



		//문자열 거꾸로
		System.out.println("문자열 거꾸로 출력 : " + sb.reverse());	//koob avaJ
		
	}
}
