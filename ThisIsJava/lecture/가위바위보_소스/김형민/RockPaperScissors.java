package com.java.test1;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int win=0;
		int lose=0;
		int m=0;
		int AI=0;
		// 1=���� 2=�� 3=����
		System.out.println("���� ���� �� ����! #3�� �� �ڵ�����");
		
		while(win<3) {
			System.out.println("===============");
			System.out.println("����/����/��");
			System.out.print("���� ���� : ");
			AI = (int)(Math.random()*3)+1;
			
			
			String inputString = sc.nextLine();
			
			
			if(inputString.equals("����") && AI == 1) {
				lose++;
				System.out.println("������ ���� : ����");
				System.out.println("�й�...");
			}if(inputString.equals("����") && AI == 2) {
				win++;
				System.out.println("������ ���� : ��");
				System.out.println("�¸�! " +win+"��°");
			}if(inputString.equals("����") && AI == 3) {
				m++;
				System.out.println("������ ���� : ����");
				System.out.println("���º�");
				
				
			}if(inputString.equals("����") && AI == 1) {
				m++;
				System.out.println("������ ���� : ����");
				System.out.println("���º�");
			}if(inputString.equals("����") && AI == 2) {
				lose++;
				System.out.println("������ ���� : ��");
				System.out.println("�й�...");
			}if(inputString.equals("����") && AI == 3) {
				win++;
				System.out.println("������ ���� : ����");
				System.out.println("�¸�! " +win+"��°");
				
				
			}if(inputString.equals("��") && AI == 1) {
				win++;
				System.out.println("������ ���� : ����");
				System.out.println("�¸�! " +win+"��°");
			}if(inputString.equals("��") && AI == 2) {
				m++;
				System.out.println("������ ���� : ��");
				System.out.println("���º�");
			}if(inputString.equals("��") && AI == 3) {
				lose++;
				System.out.println("������ ���� : ����");
				System.out.println("�й�...");
			}
			
		}
			
		System.out.println("����� "+win+"�� �ϼ̰�, "+lose+"�� �ϼ�����, "+m+"���� ���ºθ� �ϼ̽��ϴ�.");
	}

}
