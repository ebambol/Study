
package com.java.teat1;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
	/*
	 *  ���� ���� ������
	 *  ��� �Է�: "����", "����", "��"
	 *  ��ǻ�Ϳ� ������������ �� ����� ��� -> "�¸�","�й�","���º�"
	 *  Math.random() -> 1�� ������ -> "����", 2-> "����", 3-> "��"
	 *  ���ӷ� : ����<����<��<����<����<��
	 */

		      
		      String user1;
		      Scanner scanner = new Scanner(System.in);
		      
		      do {
		         System.out.print("����� �� �� : ");
		         
		         user1 = scanner.nextLine();
		         int user = 0;
		         
		         if(user1.equals("����")) {
		            user = 1;
		         } else if(user1.equals("����")) {
		            user = 2;
		         } else if(user1.equals("��")) {
		            user = 3;
		         } else {
		            System.out.println("�� �� �Է��߾��!"); }
		         
		         int computer = (int)(Math.random()*3)+1;
		         System.out.print("��ǻ�Ͱ� �� �� : ");
		          
		         
		         if(computer == 1) {
		        	 System.out.println("����");
		         	} else if(computer == 2) {
		        		 System.out.println("����");
		        	} else {
		        			 System.out.println("��");
		        	}
		         
		         
		         if(user == computer) {
						System.out.println("���º�");
					} else if(user == 1 && computer == 2) { // ���� : ����
						System.out.println("��ǻ���� �¸�");
					} else if(user == 1 && computer == 3) { // ���� : ��
						System.out.println("����� �¸�");
					} else if(user == 2 && computer == 1) { // ���� : ����
						System.out.println("����� �¸�");
					} else if(user == 2 && computer == 3) { // ���� : ��
						System.out.println("��ǻ���� �¸�");
					} else if(user == 3 && computer == 1) { // �� : ����
						System.out.println("��ǻ���� �¸�");
					} else if(user == 3 && computer == 2) {  // �� : ���� 
						System.out.println("����� �¸�");  
					}

		      	} while (true);
	}
}
