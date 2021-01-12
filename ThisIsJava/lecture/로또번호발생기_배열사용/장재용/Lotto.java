package com.java.lotto;

public class Lotto {
	public static void main(String[] args) {
		// 45개의 숫자중에 6개의 숫자를 중복없이 발생시켜 출력
		// int 배열을 사용하여 작성
		int num[] = new int[6]; // 번호
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45) + 1;
		}
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				if((i != j)&&(num[i] == num[j])) {
//					System.out.println("중복값이 확인됨! num[" + i + "] : " + num[i] + "   num[" + j + "] : " + num[j]);
					num[j] = (int)(Math.random()*45) + 1;
					i=0; // 중첩for문 끝난 이후 num[1]부터 다시 확인
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.println("로또번호 " + (i+1) + "번 : " + num[i]);
		}
	}
}
