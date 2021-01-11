package com.java.test1;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
//		int m =2;	//m단
		System.out.println("----- 구구단 -----");
		for(int m=2; m<=9; m++) {
			System.out.println("***** " +m+ "단 *****");
//		for(int m=9; m>=2; m--) {	//역순
			for(int n=1; n<=9; n++) {
				System.out.println(m+" x "+n+" = "+ (m*n));
			}
			System.out.println("===== " +m+ "단 끝 =====");
		}
	}

}
