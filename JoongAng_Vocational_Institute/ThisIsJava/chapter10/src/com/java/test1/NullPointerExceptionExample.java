package com.java.test1;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());	//Null pointer access: The variable data can only be null at this location
												//널포인트 접근 : 변수데이터는 오직 null만 이 위치에 올수 있다.
	}
}
/*Exception in thread "main" java.lang.NullPointerException
	at com.java.test1.NullPointerExceptionExample.main(NullPointerExceptionExample.java:7)
 */