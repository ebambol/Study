package com.java.test;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println(studentNum+"��");
			System.out.println("--------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				System.out.println("�л��� >");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				System.out.println("�����Է� >");
				for(int i=0; i<scores.length;i++) {
					System.out.println("scores["+i+"]>");
					scores[i]=scanner.nextInt();
				}
			}else if(selectNo == 3) {
				System.out.println("��������Ʈ >");
				for(int i=0; i<scores.length;i++) {
					System.out.println("scores["+i+"]:"+scores[i]);
				}
			}else if(selectNo == 4) {
				System.out.println("�м� >");
				int max=0; //�ִ밪 ����
				int sum=0; //���� �հ� ����
				for(int i=0; i<scores.length;i++) {
					sum = sum + scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("�ְ�����: "+max);
				System.out.println("�������: "+(double)sum/studentNum);
			}else if(selectNo == 5) {
				System.out.println("5�� ����");
				run=false;
			}
		} // End of while()
		System.out.println("���α׷� ����");
	}
}
