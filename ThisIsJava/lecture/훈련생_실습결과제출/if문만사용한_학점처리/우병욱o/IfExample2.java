package com.java.test1;

public class IfExample2 {

	public static void main(String[] args) {
		int csore = 95;
		//100 ~ 90 �̸� A ���
		//89 ~ 80 �̸� B ���
		//79 ~ 70 �̸� C ���
		//69 ~ 60 �̸� D ���
		//60�� �̸� �̸� F ���
		// ������ 0 ~ 100 ���� ���� �ƴϸ� '�Է°�����'
		if(csore<=100 && csore>= 90) { //100 ���� ũ�ų� ���� �׸��� 90���� �۰ų� ����
			System.out.println("������ 100~90.");
			System.out.println("����� A �Դϴ�.");
		}
		if(csore <90 && csore>=80) { // 90���� �۰ų� �׸��� 80���� ũ�ų� ����
			System.out.println("������89~80.");
			System.out.println("����� B �Դϴ�.");			
		}
		if(csore <80 && csore>=70) { // 80���� �۰ų� �׸��� 70���� ũ�ų� ����
			System.out.println("������79~70.");
			System.out.println("����� C �Դϴ�.");			
		}
		if(csore <70 && csore>=60) { // 70���� �۰ų� �׸��� 60���� ũ�ų� ����
			System.out.println("������ 69~60.");
			System.out.println("����� D �Դϴ�.");			
		}
		if(csore <60 && csore>=0) { // 60���� �۰ų� �׸��� 0���� ũ�ų� ����
			System.out.println("������ 59~0");
			System.out.println("����� F �Դϴ�.");
		}
		if(csore>100 || csore<0){ //100���� ũ�ų� �׸��� 0���� �۴�
			System.out.println("0 ~ 100 ���̰��� �ƴϴ�");
			System.out.println("�Է°�����");
		}
		

	}

}
