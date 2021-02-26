package com.java.test1;

public class ArrayIndexOutBoundsExceptionExample {

	public static void main(String[] args) {
		String data1 = args[0];	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
		String data2 = args[1];	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1

		System.out.println("args.length: " + args.length);
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		System.out.println("args[2]: " + args[2]);
	}
}
/*
 * args�� ���� �Ű����� ��� ����
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at com.java.test1.ArrayIndexOutBoundsExceptionExample.main(ArrayIndexOutBoundsExceptionExample.java:6)
	[Run -> Run Configurations]�� Arguments�ǿ� ���� �Ű����� �ۼ��ϸ� ��� ����
 */
