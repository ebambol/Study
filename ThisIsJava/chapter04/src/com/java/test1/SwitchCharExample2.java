//2020-12-30 이현국
package com.java.test1;

public class SwitchCharExample2 {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch (grade) {
		case 'A':
//			System.out.println("우수 회원입니다.");
//			break;
		case 'a':
			for(int i= 0 ; i<3; i++) {
			System.out.println("우수3 회원입니다.");
			}
			break;
		case 'B':
			System.out.println("일반 회원입니다.");
			break;
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
	}

}
