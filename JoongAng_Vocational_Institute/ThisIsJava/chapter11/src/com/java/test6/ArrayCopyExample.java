package com.java.test6;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//�迭���� Arrays.copyOf(�����迭, �����ұ���)
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));	//[J, A, V, A]
		System.out.println(arr2);	//JAVA
		
		//�迭���� Arrays.copyOfRange(�����迭, �����ε���, ���ε���-1)
		char[] arr3= Arrays.copyOfRange(arr1, 1, arr1.length-1);
		System.out.println(Arrays.toString(arr3));	//[A, V]
		
		//�迭���� System.arraycopy(�����迭, �����ε���, Ÿ�ٹ迭, Ÿ�ٽ����ε���, ���簳��)
		char[] arr4= new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]="+arr4[i]);
			/*
			 * arr4[0]=J arr4[1]=A arr4[2]=V arr4[3]=A
			 */
		}
	}

}
