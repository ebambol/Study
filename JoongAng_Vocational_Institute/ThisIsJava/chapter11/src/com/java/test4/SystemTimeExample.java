package com.java.test4;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();	//시작시간
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum+=i;
		}
		
		long time2 = System.nanoTime();	//종료시간
		
		System.out.println("1~1000000의 합 : " + sum);
		System.out.println("소요시간 : " + (time2-time1));
	}

}
