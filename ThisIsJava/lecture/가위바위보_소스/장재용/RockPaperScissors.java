package com.java.test1;
import java.util.Scanner;

public class RockPaperScissors {
	// ���������� ����
	// �Է��� "����", "����", "��"
	// ��ǻ�Ϳ� ������������ �� ����� ��� "�¸�", "�й�", "���º�"
	// ��ǻ�ʹ� ������ Math.random() -> 1 : "����", 2 : "����", 3 : "��"
	// �� : ����<����<��<����...
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input; // �Է�
		String comOut; // ��ǻ�� ���
		
		System.out.println("*** ��ǻ�Ϳ� ���������� ���� ***");
		
		while(true) { // while���� ���� �ݺ���Ű�� �ùٸ� �Է°��� ���� �� break������ Ż��
			System.out.println("----------------------");
			System.out.println(" ����, ����, �� �� �ϳ��� �Է��ϼ���");
			System.out.println("���Ḧ ���Ͻø� q�� �Է��ϼ���");
			System.out.print("�Է� >");
			input = scanner.nextLine();
			if(input.equals("����")) {
				System.out.println("������ �ԷµǾ����ϴ�.");
				System.out.println();
				break;
			} else if(input.equals("����")) {
				System.out.println("������ �ԷµǾ����ϴ�.");
				System.out.println();
				break;
			} else if(input.equals("��")){
				System.out.println("���� �ԷµǾ����ϴ�.");
				System.out.println();
				break;
			} else if(input.equals("q")){
				break;
			} else {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			}
		}
		
		// switch������ ��ǻ�� ��� ����
		int com = (int)(Math.random()*3) + 1;
		switch(com) {
		case 1:
			comOut = "����";
			break;
		case 2:
			comOut = "����";
			break;
		default:
			comOut = "��";
			break;
		}
		
		// ��øif������ ���� ����� ���� ���
		if(input.equals("����")) {
			if(comOut.equals("����")) {
				System.out.println(" ���º� �Դϴ�.");
				System.out.println("�����  : " + input);
				System.out.println("��ǻ��  : " + comOut);
			}
			if(comOut.equals("����")) {
				System.out.println(" �й� �Դϴ�.");
				System.out.println("�����  : " + input);
				System.out.println("��ǻ�� : " + comOut);
				}
			if(comOut.equals("��")) {
				System.out.println(" �¸� �Դϴ�.");
				System.out.println("�����  : " + input);
				System.out.println("��ǻ�� : " + comOut);
				}
		}
		if(input.equals("����")) {
			if(comOut.equals("����")) {
				System.out.println(" �¸� �Դϴ�.");
				System.out.println("�����  : " + input);
				System.out.println("��ǻ��  : " + comOut);
			}
			if(comOut.equals("����")) {
				System.out.println(" ���º� �Դϴ�.");
				System.out.println("�����  : " + input);
				System.out.println("��ǻ�� : " + comOut);
				}
			if(comOut.equals("��")) {
				System.out.println(" �й� �Դϴ�.");
				System.out.println("�����  : " + input);
				System.out.println("��ǻ�� : " + comOut);
				}
		}
		if(input.equals("��")) {
			if(comOut.equals("����")) {
				System.out.println(" �й� �Դϴ�.");
				System.out.println("�����  : " + input);
				System.out.println("��ǻ��  : " + comOut);
			}
			if(comOut.equals("����")) {
				System.out.println(" �¸� �Դϴ�.");
				System.out.println("�����  : " + input);
				System.out.println("��ǻ�� : " + comOut);
				}
			if(comOut.equals("��")) {
				System.out.println(" ���º� �Դϴ�.");
				System.out.println("�����  : " + input);
				System.out.println("��ǻ�� : " + comOut);
				}
		}
		System.out.println(" ���α׷� ����");
	}
}
