package com.java.lotto;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * 45개 중복 x , int 배열로 작성
		 */
		int[] arr = new int[6];
		for(int i=0; i<6; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(arr [i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<6; i++) {
			System.out.println(arr[i]);
		}
	}
}
