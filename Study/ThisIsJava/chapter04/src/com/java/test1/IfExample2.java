package com.java.test1;
public class IfExample2 {
	public static void main(String[] args) {
//		100~90�̻� �̸� A ���
//		89 ~ 80�̸� B ���
//		79 ~ 70�̸� C ���
//		69 ~ 60�̸� D ���
//		60�� �̸��̸� F���
//		������ 0~100 ���� ���� �ƴϸ� "�Է°� ���� "���
		

//  ���� �ۼ�
		int score = (int)(Math.random() * 100);
		System.out.println(score);

//		�Է°� ���� ���
		if(score > 100) {
			System.out.println("�Է°� ���� (100�ʰ�)");
		}
		if(score < 0) {
			System.out.println("�Է°� ���� (0�̸�)");
		}
//		��� ���
		if(score >= 90) {
			if(score < 100)  {
				System.out.println("����� A �Դϴ�.");
			}	
		}
		if(score <= 89) {
			if(score >= 80)  {
				System.out.println("����� B �Դϴ�.");
			}	
		}
		if(score <= 79) {
			if(score >= 70)  {
				System.out.println("����� C �Դϴ�.");
			}	
		}
		if(score <= 69) {
			if(score > 60)  {
				System.out.println("����� D �Դϴ�.");
			}	
		}
		if(score <= 60) {
			if(score >= 0)  {
				System.out.println("����� F �Դϴ�.");
			}	
		}

/*
 * ���� �ۼ��� �ڵ�
		int score = 100;

		if(90 <= score && score <= 100) {
			System.out.println("����� A �Դϴ�.");
		} if(80 <= score && score <= 89) {
			System.out.println("����� B �Դϴ�.");
		} if(70 <= score && score <= 79) {
			System.out.println("����� C �Դϴ�.");
		} if(60 <= score && score <= 69) {
			System.out.println("����� D �Դϴ�.");
		} if(0 <= score && score < 60) {
			System.out.println("����� F �Դϴ�.");
		} if (!(0 <= score && score <=100)){
			System.out.println("�Է°� ����");
		}
		*/
	}
}

