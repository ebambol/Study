package com.java.lotto;
public class Lotto {
	public static void main(String[] args) {
		/* (1~45)45개의 숫자 중 6개의 숫자를 중복없이 발생시켜 출력
		 * int 배열을 사용하여 작성
		 */
		int j;
		int[] lottoBall = new int[6]; //6개의 정수형 값을 lottoBall에 저장하기 위해 배열 생성 
		for(int i = 0; i < lottoBall.length; i++) //배열에 1 ~ 45를 저장 
		{	
			lottoBall[i] = (int)(Math.random()*45);  // 0 ~ 44 + 1 → 1 ~ 45
		}
			for(j = 0; j < lottoBall.length; j++) {
				for(int k = j + 1; k < lottoBall.length; k++) {
					if(lottoBall[j] == lottoBall[k]) {
						lottoBall[j] = (int)(Math.random()*45);  // 0 ~ 44 + 1 → 1 ~ 45
						j--;
						break;
					}
				}
			}
		
		for (j = 0; j < lottoBall.length; j++) { 
			System.out.print(lottoBall[j] + " "); 
		}
	}
}