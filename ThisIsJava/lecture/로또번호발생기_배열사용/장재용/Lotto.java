package com.java.lotto;

public class Lotto {
	public static void main(String[] args) {
		// 45���� �����߿� 6���� ���ڸ� �ߺ����� �߻����� ���
		// int �迭�� ����Ͽ� �ۼ�
		int num[] = new int[6]; // ��ȣ
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45) + 1;
		}
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				if((i != j)&&(num[i] == num[j])) {
//					System.out.println("�ߺ����� Ȯ�ε�! num[" + i + "] : " + num[i] + "   num[" + j + "] : " + num[j]);
					num[j] = (int)(Math.random()*45) + 1;
					i=0; // ��øfor�� ���� ���� num[1]���� �ٽ� Ȯ��
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.println("�ζǹ�ȣ " + (i+1) + "�� : " + num[i]);
		}
	}
}
