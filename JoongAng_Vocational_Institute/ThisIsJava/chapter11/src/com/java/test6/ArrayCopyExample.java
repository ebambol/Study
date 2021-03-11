package com.java.test6;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//배열복사 Arrays.copyOf(원본배열, 복사할길이)
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));	//[J, A, V, A]
		System.out.println(arr2);	//JAVA
		
		//배열복사 Arrays.copyOfRange(원본배열, 시작인덱스, 끝인덱스-1)
		char[] arr3= Arrays.copyOfRange(arr1, 1, arr1.length-1);
		System.out.println(Arrays.toString(arr3));	//[A, V]
		
		//배열복사 System.arraycopy(원본배열, 시작인덱스, 타겟배열, 타겟시작인덱스, 복사개수)
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
