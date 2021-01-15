//2020-12-30 이현국
package com.java.test1;

public class SwitchExample2 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*12)+1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나옴");
			break;

		case 2:
			System.out.println("2번이 나옴");
			break;

		case 3:
			System.out.println("3번이 나옴");
			break;

		case 4:
			System.out.println("4번이 나옴");
			break;

		case 5:
			System.out.println("5번이 나옴");
			break;

		default:
			System.out.println("1에서 5번이 나오지 않았습니다. \n나온 수 : " + num);
			break;
		}
	}

}
