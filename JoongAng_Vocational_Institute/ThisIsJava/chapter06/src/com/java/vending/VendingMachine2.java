package com.java.vending;

import java.util.*;

public class VendingMachine2 {

	public static void main(String[] args) {
		
		int input = 0;
		int money = 0;
		int sum = 0;
		String[] goods = {"�ݶ�", "���̴�", "��"};
		int[] price = {2000, 1000, 500};
		Scanner sc = new Scanner(System.in);
		String loopOut;
		while (true) {
			
			//��ǰ ���
//			System.out.println("sum: " + sum);
			for(int i=0; i<goods.length; i++) {
				System.out.print(i+1+".");
				if(i==goods.length-1) {
					System.out.println(goods[i] + " " + price[i] + "��");
				}else {
					System.out.print(goods[i] + " " + price[i] + "��" + ", ");
				}
			}
			//�Է¹ޱ�
			System.out.print("����>");
			input = sc.nextInt();
			
			System.out.print("�?>");
			int input_num = sc.nextInt();
			
			//���� ���
			sum += (price[input-1] * input_num);
			
			
			//����
			System.out.println("�� ������? y/n");
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
			if(money>sum) {
				System.out.print("�Ž����� > ");
				int result = money - sum;
				int[] moneyReturn = {50000,10000,5000,1000,500,100};
				for(int i=0; i<moneyReturn.length; i++) {
					int namuji = result/moneyReturn[i];
					result = result-(namuji*moneyReturn[i]);
					if(namuji!=0) {
						System.out.print(moneyReturn[i]+ "��:" + namuji + " ");
					}
				}
				System.out.println("����� ����");
			}
		} else {
			System.out.println("���� ������");
		}
	}

}
