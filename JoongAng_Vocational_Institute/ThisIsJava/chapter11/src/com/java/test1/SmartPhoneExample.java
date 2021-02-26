package com.java.test1;

public class SmartPhoneExample {

	public static void main(String[] args) {
		/* public String toString()
		 * This object (which is already a string!) is itself returned.
		 * 
		 * Override를 안했을때 결과값
		 * com.java.test1.SmartPhone@15db9742
		 * 
		 * Override를 했을때 결과값
		 * 구글, 안드로이드
		 */
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		
	}

}
