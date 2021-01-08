//2020-12-30 이현국
package com.java.test1;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;	//8~11시
		System.out.println("[현재시간 : " + time + "시]");	//난수 확인

		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("퇴근합니다.");
		}
	}

}
