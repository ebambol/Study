//2020-12-30 ������
package com.java.test1;

public class SwitchCharExample2 {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch (grade) {
		case 'A':
//			System.out.println("��� ȸ���Դϴ�.");
//			break;
		case 'a':
			for(int i= 0 ; i<3; i++) {
			System.out.println("���3 ȸ���Դϴ�.");
			}
			break;
		case 'B':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
		}
	}

}
