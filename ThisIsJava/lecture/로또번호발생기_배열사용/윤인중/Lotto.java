package com.java.lotto;

public class Lotto {
/* 45���� �����߿� 6���� ���ڸ� �ߺ����� �߻����� ���
 * int �迭�� ����Ͽ� �ۼ�
 */
	public static void main(String[] args) {
		int[] num = new int[6];
			for(int i=0; i<num.length; i++) {
				//System.out.println("num[" + i + "]=" + num[i]);
			num[i] = (int)(Math.random()*45)+1;
				//System.out.print(" �ζǹ�ȣ : [" + num[i] + "]");
			
			for(int k=0; k<i; k++) {
				if(num[i] == num[k]) {
					i--;
					break;
				}
			}
				
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(" �ζǹ�ȣ : [" + num[i] + "]");
		}
	}

}
