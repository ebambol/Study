package com.java.test1;

public class MultiCatchExample {
	/*
	 * try 블록에서 발생되는 여러종류의 예외를 하나의 catch블록에서 처리할 수 있음.
	 */
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e) {
			System.out.println("배열인덱스나 숫자변환값이 참조변수(Null) 등의 예외발생");
		} catch(Exception e) {
			System.out.println("알수 없는 예외 발생");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
