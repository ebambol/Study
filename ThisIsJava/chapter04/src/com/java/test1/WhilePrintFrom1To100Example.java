package com.java.test1;

public class WhilePrintFrom1To100Example {

	public static void main(String[] args) {
		int i= 100;	//카운터 변수
		int sum=0;	//합계 저장 변수
		while(i<=100) {
//			i++;	// sum = 5150	(2~101)
			sum +=i;
			i++;	// sum = 5050	(2~101)
		}
		//(i-1) ---> i=101-1
		System.out.println("1~"+(i-1) +"의 합 : " +sum);
	}

}
