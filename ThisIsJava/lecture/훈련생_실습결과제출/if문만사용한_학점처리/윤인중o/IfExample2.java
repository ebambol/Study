package com.java.test1;

public class IfExample2 {
	public static void main(String[] args) {
		// 100 ~ 90 �̸� 'A'���
		// 89 ~ 80�̸� 'B'���
		// 79 ~ 70�̸� 'C'���
		// 69 ~60�̸� 'D'���
		// 60�� �̸� �̸� 'F'���
		// ������ 0~100���� ���� �ƴϸ� '�Է°�����'
		
		int score = 100;
									
		if(score > 100) {
			System.out.println("�Է°�����(100�ʰ�)");
		}		
		if(score <0) {
			System.out.println("�Է°�����(0�̸�)");
		}		
		if(score>=90 && score<=100) {
			//System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		} 
		if(score>=80 && score<90) {
			System.out.println("�����  B �Դϴ�.");
		}
		if(score>=70 && score<80) {
			System.out.println("����� C �Դϴ�.");
		}
		if(score>=60 && score<70) {
			System.out.println("����� D �Դϴ�.");
		}
		if(score<60 && score>=0) {
			System.out.println("����� F �Դϴ�.");
		}
	}
}
