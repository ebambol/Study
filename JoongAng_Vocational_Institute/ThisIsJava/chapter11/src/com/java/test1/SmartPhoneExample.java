package com.java.test1;

public class SmartPhoneExample {

	public static void main(String[] args) {
		/* public String toString()
		 * This object (which is already a string!) is itself returned.
		 * 
		 * Override�� �������� �����
		 * com.java.test1.SmartPhone@15db9742
		 * 
		 * Override�� ������ �����
		 * ����, �ȵ���̵�
		 */
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		
	}

}
