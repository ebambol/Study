package com.java.test6;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		//�ڵ� Boxing
		Integer obj = 100;
		System.out.println("value: "+obj.intValue());
		System.out.println("value: "+obj);
		System.out.println("value: "+obj.toString());
		System.out.println("value: "+(100+obj));

		//���� �� �ڵ� Unboxing
		int value = obj;	//�⺻�ڷ����� obj��ü ����
		System.out.println("value: "+value);

		//���� �� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result: "+result);
	} 
}
