package com.java.test;

public class Exercise07 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;	//�ִ밪 ���ϱ�
		int min = Integer.MAX_VALUE;	//������ ���ϱ�
		int[] array = {-1,-5,-3,-8,-2};
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
			if (array[i]<min) {
				min = array[i];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
	}

}
