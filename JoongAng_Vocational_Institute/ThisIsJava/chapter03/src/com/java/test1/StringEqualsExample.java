package com.java.test1;

public class StringEqualsExample {
	public static void main (String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");	//���ο� ��ü �߰�
		
		System.out.println(strVar1 == strVar2);	//���� �ּҰ�
		System.out.println(strVar1 == strVar3);	//new String���� �ٸ� �ּҰ� 
		System.out.println();
		System.out.println(strVar1.equals(strVar2));	//���ڿ� �� true
		System.out.println(strVar1.equals(strVar3));	//���ڿ� �� true
		// String ��ü�� ���� ���ڿ��� �������� ���� ��, equals() �޼ҵ带 ����ؾ� ��.
	}
}
//== �����ڴ� ���ϰ��� �ϴ� ����� �ּҰ��� ��
//equals �޼ҵ�� ���ϰ��� �ϴ� ����� ���� ��ü�� ��
/* ���๮ 
true
false

true
true
*/