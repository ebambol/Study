package com.java.test4;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();	//���۽ð�
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum+=i;
		}
		
		long time2 = System.nanoTime();	//����ð�
		
		System.out.println("1~1000000�� �� : " + sum);
		System.out.println("�ҿ�ð� : " + (time2-time1));
	}

}
