package com.java.lotto;

public class Lotto2 {

	public static void main(String[] args) {
		/*
		 * 45�� �ߺ� x , int �迭�� �ۼ�
		 */
		int[] num = new int[6]; 	//ũ�Ⱑ 6�� �迭�� �����
		boolean check = true;
//		for(int i=0; i<num.length; i++) {	// �迭 ���� ���
//			System.out.println("num["+i+"]="+num[i]);
//		}
		do {
			for(int i=0; i<num.length; i++) {	//�ζǰ����� �迭����
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
