package com.java.test1;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// A~Z �����ڵ� 65~90
		// a~z �����ڵ� 97~122
		// 0~9 �����ڵ� 48~57


		int charCode = 'A';
		System.out.println("charCode :" + (char)charCode);
		
		if((charCode>=65) & (charCode<=90) ) {	//charCode 65 ~ 90 ������ ���̳�?
			System.out.println("�빮�� �̱���");
		}
		if((charCode>=97) && (charCode<=122) ) {
			System.out.println("�ҹ��� �̱���");
		}
		if((charCode>=48) && (charCode<=57) ) {
			// �ڵ尡 48���� ũ�ų� �����鼭, 57���� �۴�
			// �ڵ尡 48�̻��̸鼭 57���ϸ� ���ڴ�.
			System.out.println("0~9 ���� �̱���");
		}
		if(!(charCode<48) && !(charCode>57) ) {
			// �ڵ尡 48���� ���� �ʰ� 57���� �۴� 
			// 48 �̸��� �ƴϰ�, 57�ʰ����� �ʴ´� => 48�� �ʰ��ϸ鼭 57�̸��̴� => 48�� �ʰ� 57�̸��� ��
			System.out.println("0~9 ���� �̱���");
		}
		
		int value = 6;
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� ��� �̱���.");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� ��� �̱���.");
		}
		if((value%2==0) && (value%3==0)) {
			System.out.println("2�� 3�� ��� �̱���.");
		}
		//¦�� Ȧ��
//		if(value%2==0) {
//			System.out.println("¦��");
//		}else {
//			System.out.println("Ȧ��");
//		}
	}
}
