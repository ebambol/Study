package com.java.test6;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//Boxing : �⺻�ڷ��� - > WrapperŬ���� Ÿ���� ��ü�� ��ȯ
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");	//"200" -> 200��ȯ�Ǿ� ����
		Integer obj3 = Integer.valueOf("300");
		
		//UnBoxing : Wrapper Ŭ���� Ÿ���� ��ü -> �⺻ �ڷ������� ��ȯ
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//CharacterŸ��
		Character obj4 = new Character('��');
		char value4 = obj4.charValue();
		System.out.println(value4);
	}

}
