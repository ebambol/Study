package com.java.lotto;

import java.util.Scanner;

public class RockPaperScissors3 {
	
	public static void main(String[] args) {
					
		Scanner scanner = new Scanner(System.in);
			System.out.println("����, ����, �� �߿� �ϳ��� �����ϼ���.");
			
		String user = scanner.next();
		
			
		int user1 = 0;
		String com1 = "";
		
		
	    int com =(int)(Math.random()*3) + 1;
	    		
		if(com == 1) {
			com1 = "����";
		} else if(com == 2) {
			com1 = "����";
		} else if(com == 3) {
			com1 = "��";
		}
		                                                             	
		if(user.equals("����")) {
			user1 = 1;
			if(user1 == com) {
				System.out.println("�����" + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ�" + com1 + "�� �½��ϴ�.");
				System.out.println("�����ϴ�.");
			} else if(user1 - com == -1) {
				System.out.println("�����" + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ�" + com1 + "�� �½��ϴ�.");
				System.out.println("��ǻ���� �¸��Դϴ�.");
			} else if(user1 - com == -2) {
				System.out.println("�����" + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ�" + com1 + "�� �½��ϴ�.");
				System.out.println("YOU WIN!!");
			}
		}
		if(user.equals("����")) {
			user1 = 2;
			if(user1 == com) {
				System.out.println("�����" + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ�" + com1 + "�� �½��ϴ�.");
				System.out.println("�����ϴ�.");
			} else if(user1 - com == -1) {
				System.out.println("�����" + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ�" + com1 + "�� �½��ϴ�.");
				System.out.println("��ǻ���� �¸��Դϴ�.");
			} else if(user1 - com == 1) {
				System.out.println("�����" + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ�" + com1 + "�� �½��ϴ�.");
				System.out.println("YOU WIN!!");
			}
		}
		if(user.equals("��")) {
			user1 = 3;
			if(user1 == com) {
				System.out.println("�����" + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ�" + com1 + "�� �½��ϴ�.");
				System.out.println("�����ϴ�.");
			} else if(user1 - com == 2) {
				System.out.println("�����" + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ�" + com1 + "�� �½��ϴ�.");
				System.out.println("��ǻ���� �¸��Դϴ�.");
			} else if(user1 - com == 1) {
				System.out.println("�����" + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ�" + com1 + "�� �½��ϴ�.");
				System.out.println("YOU WIN!!");
			}
		}
		
		 	
		
	} //main
}  //class
