package com.java.test1;

import java.util.Scanner;

public class RockPaperScissors {
	/*
	 * ���������� ����
	 * �Է� : "����","����","��"
	 * ��ǻ�Ϳ� ������������ �� ��� ��� =>"�¸�","�й�"
	 * Math.random() => 1=>"����", 2=>"����" 3=>"��"
	 * ���ӷ� : ����<����<��
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	//Scanner ȣ��

		while (true) { 
			int num = 0;	//�Է¹����� 1~3���� �ִ°�
			int com = (int)(Math.random()*3)+1;	//1~3 ������
			String comresult = null;	//��ǻ�� ��� ���ڿ�
//			System.out.println(com);	//Ȯ�ο�
			System.out.println("======================================");
			System.out.println("���������� ���� (����, ����, �� �� �ϳ� �Է����ּ���)");
			System.out.println("�����ϱ� : n �Է�");
			System.out.println("======================================");
			System.out.print(">");

			String input = sc.nextLine();	//�Է°� input�� ����

			//����� �Է�
			if(input.equals("n")) {
				System.out.println("=================��������================");
				break;	//n �Է½� ����
			}else if(input.equals("����")) {	//���ڿ��� "����"�� ������ ��
				num=1;	//���� = 1
			}else if(input.equals("����")) {
				num=2;	//���� = 2
			}else if(input.equals("��")) {
				num=3;	//�� = 3
			}else {
				System.out.println("�ٽ��Է�");
				continue;
			}
			//com�� ���ڿ��� ����
			switch (com) {
			case 1:
				comresult = "����";
				break;
			case 2:
				comresult = "����";
				break;
			case 3:
				comresult = "��";
				break;
			}
			
			//���
			System.out.println("--------------------------------------");
			System.out.println(">>>>> ��: [" +input +"]  vs  "+ "��: [" + comresult + "] <<<<<");
			//���� Ȯ��
			if(num==com) {
				System.out.println("[�����ϴ�.]");
			}else if((num== 1&&com==2)||(num==2&&com==3)||(num==3&&com==1)) {
				System.out.println("[�й�]");
			}else if((num==1&&com==3)||(num==2&&com==1)||(num==3&&com==2)) {
				System.out.println("[�¸�]");
			}
			System.out.println("--------------------------------------");
		}
	}
}
//			
//			switch (num) {
//			case 1:
//				if(com==2) {
//					System.out.println("�й�");
//				}else if(com==3){
//					System.out.println("�¸�");
//				}
//				break;
//			case 2:
//				if(com==3) {
//					System.out.println("�й�");
//				}else if(com==1){
//					System.out.println("�¸�");
//				}
//				break;
//			case 3:
//				if(com==1) {
//					System.out.println("�й�");
//				}else if(com==2){
//					System.out.println("�¸�");
//				}
//				break;



