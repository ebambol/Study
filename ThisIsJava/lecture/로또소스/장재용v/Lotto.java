package com.java.test1;

public class Lotto {
// �ζǹ�ȣ �߻��⸦ �������� �� �ߺ����� ������ �ʵ��� �����ϱ�
	public static void main(String[] args) {
		int lnum1 = (int)(Math.random()*45) + 1;
		int lnum2 = (int)(Math.random()*45) + 1;
		int lnum3 = (int)(Math.random()*45) + 1;
		int lnum4 = (int)(Math.random()*45) + 1;
		int lnum5 = (int)(Math.random()*45) + 1;
		int lnum6 = (int)(Math.random()*45) + 1;
		
		// while�� & ������ 
		while((lnum1 == lnum2) || (lnum1 == lnum3) || (lnum1 == lnum4) || (lnum1 == lnum5) || (lnum1 == lnum6) || (lnum2 == lnum3) || (lnum2 == lnum4) || (lnum2 == lnum5) || (lnum2 == lnum6) || (lnum3 == lnum4) || (lnum3 == lnum5) || (lnum3 == lnum6) || (lnum4 == lnum5) || (lnum4 == lnum6) || (lnum5 == lnum6)) {
			lnum1 = (int)(Math.random()*45) + 1;
			lnum2 = (int)(Math.random()*45) + 1;
			lnum3 = (int)(Math.random()*45) + 1;
			lnum4 = (int)(Math.random()*45) + 1;
			lnum5 = (int)(Math.random()*45) + 1;
			lnum6 = (int)(Math.random()*45) + 1;
		}
		
		System.out.println("�ζǹ�ȣ lnum1 : " + lnum1);
		System.out.println("�ζǹ�ȣ lnum2 : " + lnum2);
		System.out.println("�ζǹ�ȣ lnum3 : " + lnum3);
		System.out.println("�ζǹ�ȣ lnum4 : " + lnum4);
		System.out.println("�ζǹ�ȣ lnum5 : " + lnum5);
		System.out.println("�ζǹ�ȣ lnum6 : " + lnum6);

	}
}
