package com.java.lotto;

public class Lotto {
/* 45개의 숫자중에 6개의 숫자를 중복없이 발생시켜 출력
 * int 배열을 사용하여 작성
 */
	public static void main(String[] args) {
		int[] num = new int[6];
			for(int i=0; i<num.length; i++) {
				//System.out.println("num[" + i + "]=" + num[i]);
			num[i] = (int)(Math.random()*45)+1;
				//System.out.print(" 로또번호 : [" + num[i] + "]");
			
			for(int k=0; k<i; k++) {
				if(num[i] == num[k]) {
					i--;
					break;
				}
			}
				
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(" 로또번호 : [" + num[i] + "]");
		}
	}

}
