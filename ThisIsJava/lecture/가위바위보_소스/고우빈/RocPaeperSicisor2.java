package com.java.test1;

import java.util.Scanner;
public class RocPaeperSicisor2 {
 public static void main(String[]args) {
/* ���������� ����
 * �Է� : ���� , ���� , ��   nextLine �̿�
 * ��ǻ�Ϳ� ���������� �� ����� ��� => "�¸�" "�й�" : ���º� 
 * Math.random() => 1.���� 2.���� 3.��	
 * ����<����<��<���� 
 * (user1==���� && coms==����) (user1==���� && coms==����)  (user1==�� && coms==����)x
 * (user1==���� && coms==����) (user1==���� && coms==����) (user1==�� && coms==����)
 * (user1==���� && coms==��)  (user1==���� && coms==��) (user1==�� && coms==��)
 * �¸� = 
 * String a =equals.x
 *  */
	 Scanner cs = new Scanner(System.in);
		int com;
		String coms;
		String user;
		String ai;
		String result;
		
		System.out.println("���� / ���� / �� ");
		do{ 
			com = (int)(Math.random()*3)+1;  //��ǻ�� �Է°� ��������
			System.out.println("����� �Է� :");
			user = cs.nextLine();    // ����� �Է°�
		if (com == 1) {               // ��ǻ�� �Է°� ������ȯ
			coms = "����";
			System.out.println("��ǻ�� �Է� :"+coms);
			ai =user;
			switch(ai) {                    //���� ���
			 case "����": 
				System.out.println("���º�");
				break;
			 case "����":
				 System.out.println("�¸�");
				 break;
			 case "��":
			 System.out.println("�й�");
			 break;
			}
			}
		 if (com == 2) { 
				coms = "����";
				
				System.out.println("��ǻ�� �Է� :"+coms);
				ai =user;
				switch(ai) {
				 case "����": 
					System.out.println("�й�");
					break;
				 case "����":
					 System.out.println("���º�");
					 break;
				 case "��":
				 System.out.println("�¸�");
				 break;
				}}
		 if (com == 3)  {
				coms = "��";
				System.out.println("��ǻ�� �Է� :"+ coms);
				ai =user;
				switch(ai) {
				 case "����": 
					System.out.println("�¸�");
					break;
				 case "����":
					 System.out.println("�й�");
					 break;
				 case "��":
				 System.out.println("���º�");
				 break;
				}
				}
			}while(! user.equals("q"));
			    System.out.println();
			    System.out.println("program end");
 } 
}