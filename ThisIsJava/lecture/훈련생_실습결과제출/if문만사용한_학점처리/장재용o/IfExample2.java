package com.java.test1;

public class IfExample2 {
	public static void main(String[] args) {
		// 90 �̻��̸� A ���, 80~89 �̸� B ���, 70~79 �̸� C���, 60~69 �̸� D���, 60�� �̸��̸� F���
		// ������ 0~100 ���� ���� �ƴϸ� '�Է°� ����'
		// IF���� ���!!!

		int score = 95;
//		int score = 85;
//		int score = 75;
//		int score = 65;
//		int score = 55;
//		int score = 105;
//		int score = -15;
		
		// IF�� + �������� �̿�
/*		
			if(score>=90 && score<100) {
				System.out.println("������ 90 �̻��Դϴ�.");
				System.out.println("����� A �Դϴ�.");
			}  if(score>=80 && score<90) {
				System.out.println("������ 80~89 �Դϴ�.");
				System.out.println("����� B �Դϴ�.");
			}  if(score>=70 && score<80) {
				System.out.println("������ 70~79 �̻��Դϴ�.");
				System.out.println("����� C �Դϴ�.");
			}  if(score>=60 && score<70) {
				System.out.println("������ 60~69 �̻��Դϴ�.");
				System.out.println("����� D �Դϴ�.");
			}  if(score>=0 && score<60) {
				System.out.println("������ 60 �̸��Դϴ�.");
				System.out.println("����� F �Դϴ�.");
			}  if(!(score>=0 && score<=100)) {
			System.out.println("�Է°� ����");
			}
*/
		// �ٸ����(��ø IF��)
/*
		if(score>100) {
			System.out.println("�Է°� ����(100�ʰ�)");
		}
		if(score<0) {
			System.out.println("�Է°� ����(0�̸�)");
		}
		if(score<=100) {
			if(score>=90) {
				System.out.println("������ 90 �̻��Դϴ�.");
				System.out.println("����� A �Դϴ�.");
			}
			if(score<90) {
				if(score>=80) {
					System.out.println("������ 80~89 �����Դϴ�.");
					System.out.println("����� B �Դϴ�.");
				}
				if(score<80) {
					if(score>=70) {
						System.out.println("������ 70~79 �����Դϴ�.");
						System.out.println("����� C �Դϴ�.");
					}
					if(score<70) {
						if(score>=60) {
							System.out.println("������ 60~69 �����Դϴ�.");
							System.out.println("����� D �Դϴ�.");
						}
						if(score<60) {
							if(score>=0) {
								System.out.println("������ 60 �̸��Դϴ�.");
								System.out.println("����� F �Դϴ�.");
							}
						}
					}
				}
			}
		}
*/
	}			
}
