//2020-12-21 �̰��� �ڹٴ� ������
package com.java.test1;

public class StringConcatExample {
	public static void main (String[] args) {
		String str1 = "JDK" + 6.0;	//String + String
		String str2 = str1 + " Ư¡";	//String + String
		System.out.println(str2);	//JDK6.0 Ư¡
		
		String str3 = "JDK" + 3 + 3.0;	
//String + int + int => String(���ڿ�) �켱
		String str3_1 = "JDK" + (3 + 3.0);	//()���� ���� double ��ȯ, 3+3.0 ���� JDK
		String str4 = 3 + 3.0 + "JDK";	//3 + 3.0 double ��ȯ, ���� ���ڿ�
		System.out.println(str3);	//JDK 33.0
		System.out.println(str3_1);	//JDK 6.0
		System.out.println(str4);	//6.0JDK
	}
}
/* ���๮
JDK6.0 Ư¡
JDK33.0
JDK6.0
6.0JDK
*/