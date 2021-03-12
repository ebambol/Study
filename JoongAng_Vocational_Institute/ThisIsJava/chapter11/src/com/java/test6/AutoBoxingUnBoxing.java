package com.java.test6;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value: "+obj.intValue());
		System.out.println("value: "+obj);
		System.out.println("value: "+obj.toString());
		System.out.println("value: "+(100+obj));

		//대입 시 자동 Unboxing
		int value = obj;	//기본자료형에 obj객체 저장
		System.out.println("value: "+value);

		//연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: "+result);
	} 
}
