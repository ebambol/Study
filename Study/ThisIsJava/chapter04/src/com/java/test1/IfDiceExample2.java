package com.java.test1;

public class IfDiceExample2 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*45)+1;
//		System.out.println("Math.random() " + (int)((Math.random()*6)+1));
//		int num;
//		while (true) {
//			num = (int)(Math.random()*45)+1;
//			System.out.println("�ζǹ�ȣ ���� = " + num);
//			if(num==45) {
//			break;
//			}
//		}
//		Math.random()
//		0 <= ������ < 1 (0�̻� 1�̸��� �Ǽ�(double)��)
//		�ζ� ��ȣ ���� 1~45
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		}else if (num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		}else if (num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		}else if (num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		}else if (num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		}else {
			System.out.println("6���� ���Խ��ϴ�.");
		}
		/*
		switch(num) {
		case 1 :
			System.out.println("1��");
			break;
		case 2 :
			System.out.println("2��");
			break;
		case 3 :
			System.out.println("3��");
			break;
		case 4 :
			System.out.println("4��");
			break;
		case 5 :
			System.out.println("5��");
			break;
		default :
			System.out.println("6��");
			break;
		}
		*/
	}

}
