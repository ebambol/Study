package com.java.vending;

import java.util.*;

public class VendingMachine {

	public static void main(String[] args) {


		int input = 0;
		int money = 0;
		int sum = 0;
		String[] goods = {"�ݶ�", "���̴�", "��"};
		int[] price = {2000, 1000, 500};
		int[] goodsNum = {10,10,10};
		Scanner sc = new Scanner(System.in);
		String loopOut;
		while (true) {

			//��ǰ ���
			//					System.out.println("sum: " + sum);
			for(int i=0; i<goods.length; i++) {
				System.out.print((i+1)+".");
//				if(i==goods.length-1) {
//					System.out.print(goods[i] + " " + price[i] + "�� " );
//				}else {
					System.out.print(goods[i] + " " + price[i] + "��" + ", ");
//				}
				System.out.print("���� ����: "+goodsNum[i] + " | ");
			}
			System.out.println();
			//�Է¹ޱ�
			System.out.print("����>");
			input = sc.nextInt();
			if(input>3) {
				System.out.println("�ٽ��Է�");
				continue;
			}
			System.out.print("�?>");
			int inputNum = sc.nextInt();
			if(inputNum>10||inputNum<=0) {
				System.out.println("�ùٸ� ���� �Է��ϼ���");
				continue;
			}
			goodsNum[input-1] -= inputNum;


			//���� ���
			sum += (price[input-1] * inputNum);

			//ǰ�� Ȯ��
			for(int i=0; i<goodsNum.length; i++) {
				if(goodsNum[i] <=0) {
					System.out.println(goods[i]+" ǰ��");
				}
			}

			//����
			System.out.print("�� ������?(y/n) >");
			loopOut = sc.next();
			if(loopOut.equals("n")||loopOut.equals("N")) {
				break;
			}else if(loopOut.equals("y") || (loopOut.equals("Y"))) {
				continue;
			}
		}
		//�� �Է� �ޱ�
		System.out.println("����:" + sum);
		System.out.print("���� ����>");
		money = sc.nextInt();
		if(money>=sum) {
				int result = money - sum;
				System.out.print("�Ž����� >");
				System.out.println(result);
				int[] moneyReturn = {50000,10000,5000,1000,500,100,50,10};
				for(int i=0; i<moneyReturn.length; i++) {
					int div = result/moneyReturn[i];
					result = result-(div*moneyReturn[i]);
					if(div!=0) {
						System.out.print(moneyReturn[i]+ "��:" + div + " ");
					}
				}
				System.out.println();
				System.out.println("����� ����");
			} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
		System.out.println("���α׷� ����");
	}

}
