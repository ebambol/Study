package com.java.test1;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		for(i=0; i<=100; i++) {
			sum += i;
		}
		//(i-1)는 0~100 반복후 카운터 변수 값 i=101에서 -1
		System.out.println("1~"+(i-1) + "합: " + sum);
	}

}
