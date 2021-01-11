package com.java.lotto;

public class Lotto2 {

	public static void main(String[] args) {
		/*
		 * 45개 중복 x , int 배열로 작성
		 */
		int[] num = new int[6]; 	//크기가 6인 배열을 만든다
		boolean check = true;
//		for(int i=0; i<num.length; i++) {	// 배열 값을 출력
//			System.out.println("num["+i+"]="+num[i]);
//		}
		do {
			for(int i=0; i<num.length; i++) {	//로또값생성 배열저장
				num[i] = (int)(Math.random()*45)+1;
				System.out.println("num["+i+"]="+num[i]);
			}
			for(int j=0; j<num.length; j++) {
				for(int k=0; k<j; k++) {
					System.out.println("j="+j+", k=" +k);
				}
			}
		}while(check);
	}	
}
