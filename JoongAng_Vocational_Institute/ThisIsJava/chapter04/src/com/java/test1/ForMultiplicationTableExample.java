package com.java.test1;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
//		int m =2;	//m��
		System.out.println("----- ������ -----");
		for(int m=2; m<=9; m++) {
			System.out.println("***** " +m+ "�� *****");
//		for(int m=9; m>=2; m--) {	//����
			for(int n=1; n<=9; n++) {
				System.out.println(m+" x "+n+" = "+ (m*n));
			}
			System.out.println("===== " +m+ "�� �� =====");
		}
	}

}
