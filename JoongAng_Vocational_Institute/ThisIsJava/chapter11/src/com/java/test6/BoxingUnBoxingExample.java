package com.java.test6;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//Boxing : 기본자료형 - > Wrapper클래스 타입의 객체로 변환
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");	//"200" -> 200변환되어 저장
		Integer obj3 = Integer.valueOf("300");
		
		//UnBoxing : Wrapper 클래스 타입의 객체 -> 기본 자료형으로 변환
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//Character타입
		Character obj4 = new Character('가');
		char value4 = obj4.charValue();
		System.out.println(value4);
	}

}
