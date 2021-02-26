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
 * args에 실행 매개값이 없어서 나옴
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at com.java.test1.ArrayIndexOutBoundsExceptionExample.main(ArrayIndexOutBoundsExceptionExample.java:6)
	[Run -> Run Configurations]에 Arguments탭에 실행 매개값을 작성하면 결과 나옴
 */
