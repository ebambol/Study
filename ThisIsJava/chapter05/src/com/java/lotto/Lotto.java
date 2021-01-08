package com.java.lotto;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * 45개 중복 x , int 배열로 작성
		 */
		int[] arr = new int[6];
		for(int i=0; i<6; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<6; j++) {
				if(arr[i] == arr[j]) {
					continue;
				}
				System.out.println(arr[i]);
			}
		}
//		System.out.println(arr);
//		while (true) {
//			int random = (int)(Math.random()*45)+1;
//		}
		
		
	}

}
