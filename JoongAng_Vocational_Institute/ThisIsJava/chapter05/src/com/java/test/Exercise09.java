package com.java.test;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run =true;
		int studentNum = 0;
		int[] scores = null;	//null���̶� new������ �ʿ�
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����>");

			int selectNo = scanner.nextInt();

			if(selectNo == 1) {
				System.out.print("�л���>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];	//�̰� ��ġ ����!!! for���� ���� �ȵ�
			}else if (selectNo == 2) {
				for (int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = scanner.nextInt();
				}
			}else if (selectNo == 3) {
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores["+i+"]:" + scores[i]);
				}
			}else if (selectNo == 4) {
				int max=Integer.MIN_VALUE;	//�ִ밪
				int sum =0;	//�����հ�
				for(int i=0; i<studentNum; i++) {
					sum += scores[i];
					if(max<scores[i]) {
						max = scores[i];
					}
				}
//				double avg = (double)sum/studentNum;
				double avg = (double)sum/scores.length; 
				System.out.println("�ְ�����: " + max);
				System.out.println("�������: " + avg);

			}else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}