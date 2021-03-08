package com.java.test3;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;

		for(int i=1;i<=50;i++) {
			counter = new Counter(i);	//Counter 객체 생성

			counter = null;	//Counter객체를 쓰레기로 만듬

			System.gc();	//Garbage Collector 실행 요청
		}
	}

}
