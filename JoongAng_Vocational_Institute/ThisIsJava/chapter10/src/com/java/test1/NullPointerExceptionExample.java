package com.java.test1;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());	//Null pointer access: The variable data can only be null at this location
												//������Ʈ ���� : ���������ʹ� ���� null�� �� ��ġ�� �ü� �ִ�.
	}
}
/*Exception in thread "main" java.lang.NullPointerException
	at com.java.test1.NullPointerExceptionExample.main(NullPointerExceptionExample.java:7)
 */