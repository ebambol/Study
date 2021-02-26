package com.java.test1;

public class ArrayIndexOutBoundsExceptionExample2 {

	public static void main(String[] args) {
		if(args.length==2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + args[0]);
			System.out.println("args[1]: " + args[1]);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("매개변수 값을 2개 넣으세요");
		}
	}
}