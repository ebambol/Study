package com.java.lotto;
public class Lotto {
	public static void main(String[] args) {
		/* (1~45)45���� ���� �� 6���� ���ڸ� �ߺ����� �߻����� ���
		 * int �迭�� ����Ͽ� �ۼ�
		 */
		int j;
		int[] lottoBall = new int[6]; //6���� ������ ���� lottoBall�� �����ϱ� ���� �迭 ���� 
		for(int i = 0; i < lottoBall.length; i++) //�迭�� 1 ~ 45�� ���� 
		{	
			lottoBall[i] = (int)(Math.random()*45);  // 0 ~ 44 + 1 �� 1 ~ 45
		}
			for(j = 0; j < lottoBall.length; j++) {
				for(int k = j + 1; k < lottoBall.length; k++) {
					if(lottoBall[j] == lottoBall[k]) {
						lottoBall[j] = (int)(Math.random()*45);  // 0 ~ 44 + 1 �� 1 ~ 45
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