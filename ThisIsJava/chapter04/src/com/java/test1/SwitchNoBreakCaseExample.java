//2020-12-30 ������
package com.java.test1;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;	//8~11��
		System.out.println("[����ð� : " + time + "��]");	//���� Ȯ��

		switch(time) {
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
		case 10:
			System.out.println("������ ���ϴ�.");
		default:
			System.out.println("����մϴ�.");
		}
	}

}
