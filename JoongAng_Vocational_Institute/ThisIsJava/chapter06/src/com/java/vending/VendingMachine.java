package com.java.vending;

import java.util.*;

public class VendingMachine {

	public static void main(String[] args) {
		/*
		 * ���Ǳ� �����
		 * 1. ���Ǳ� ������ ���ϴ� ���� ���� (���� �ϰų�)
		 * 2. ������� ���(����,����)���� ��� (������ �����)
		 * 3. ��(�ݾ�)�� ���� �� �ֵ��� ó��
		 * 4. ����� ������ ����� ������ �Է��� �� �ֵ��� ó��
		 * 5. ����� �����ϸ� ������� ��µǰ�,
		 * 6. �Ž������� ���
		 * ����, �ִ¼� (�Ҽ�������)
		 * (��, ������ ������� �ݾ��� �ʰ��� ��� "�ܾ��� �����մϴ�" ���
		 */
		
		int sum = 0;
		int money = 0;
		int count = 0;
		String arr[] = {"�Ƹ޸�ī��", "ī���", "�����̵�", "���⿡�̵�"};
		int arr_mouth[] = {100,200,300,400};
		String arr_save[] = null;
		OUT : while(true) {
			System.out.print("����� ���� : ");
			for(int i=0; i<arr.length; i++) {
				System.out.print(i+1+".");
				if(i==arr.length-1) {
					System.out.print(arr[i] +" "+ arr_mouth[i]+"��");
				}else {
					System.out.print(arr[i] +" "+ arr_mouth[i]+"��, ");
				}
			}
			Scanner sc = new Scanner(System.in);
			
			boolean InWhile = true;
			while(InWhile) {
			//����� ����
			System.out.println();
			System.out.print("�̰���� ����� ����>");
			count++;
			int input = sc.nextInt();
			
			String[] arr_save = new String[count];
			for(int i=0; i<count; i++) {
				arr_save[i] = arr[input-1];
				System.out.println(arr_save[i]);
			}
			//����� ����
			System.out.print("�>");
			int input_num = sc.nextInt();
			//����ǥ��
			System.out.println("�ϰ� �� ����� : " + arr[input-1] + ", ���� : " +input_num + " ���� : " + (sum + arr_mouth[input-1] * input_num));
			System.out.print("�̴´�? (y/n)>");
			String output = sc.next();
			if(output.equals("y")) {

			//�� �Է�
			System.out.print("����>");
			money = sc.nextInt();
			System.out.println("���� �ݾ� " + money);
				int money_di = money - (arr_mouth[input-1]*input_num);
				System.out.println(arr_mouth[input-1]*input_num);
				System.out.println("�Ž����� : " + money_di);
				break OUT;
			} else {
				sum+= (arr_mouth[input-1] * input_num);
				continue;
			}
			
			}
//			//�� �Է�
//			System.out.print("����>");
//			money = sc.nextInt();
//			System.out.println("���� �ݾ� " + money);
			
			//���Ȯ��
//			System.out.println("�̴´�? (y/n)");
//			String output = sc.next();
//			if(output.equals("y")) {
//				int money_di = money - (arr_mouth[input-1]*input_num);
//				System.out.println(arr_mouth[input-1]*input_num);
//				System.out.println("�Ž����� : " + money_di);
//				break;
//			} else {
//				continue;
//			}

			//�Ž����� ���
//			int money_di = money - (arr_mouth[input-1]*input_num);
//			System.out.println(arr_mouth[input-1]*input_num);
//			System.out.println("�Ž����� : " + money_di);
//			
			
//			break;	//�����
		}
		System.out.println("���� ���� ������");

	}

}
