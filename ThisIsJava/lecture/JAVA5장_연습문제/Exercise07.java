package com.java.test;
public class Exercise07 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE; // 최대값 구하기
		int min = Integer.MAX_VALUE; // 최소값 구하기
		System.out.println("Integer.MIN_VALUE : "+Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE : "+Integer.MAX_VALUE);	
		int[] array = {1,5,3,8,2,100,-200};
		for(int i=0; i<array.length;i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}

}
