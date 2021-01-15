package com.java.lotto;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * 45개 중복 x , int 배열로 작성
		 */
		int[] arr = new int[6];	//인덱스 0~5까지 배열 생성
		for(int i=0; i<6; i++) {
			arr[i] = (int)(Math.random()*45)+1;	//i=0~5 이면 arr[i]에 랜덤값 넣기
			for(int j=0; j<i; j++) {	// j<i일때 중첩 for문
				if(arr [i] == arr[j]) {	//	중복제거
					i--;				//i 1빼고 for문 반복
					break;	//빠져나가기
				}
			}
		}
		System.out.print("당첨번호 : ");
		//출력
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == arr[arr.length-1]) {	//arr[i]가 arr[5] 일때
				System.out.print(arr[i]);	// arr[i] 출력
			}else {
				System.out.print(arr[i]+", ");	//아니면 arr[i] + ,
			}
		}
	}
}
