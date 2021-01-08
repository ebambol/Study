package com.java.test1;

public class IfDiceExample2 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*45)+1;
//		System.out.println("Math.random() " + (int)((Math.random()*6)+1));
//		int num;
//		while (true) {
//			num = (int)(Math.random()*45)+1;
//			System.out.println("로또번호 생성 = " + num);
//			if(num==45) {
//			break;
//			}
//		}
//		Math.random()
//		0 <= 난수값 < 1 (0이상 1미만의 실수(double)값)
//		로또 번호 생성 1~45
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if (num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if (num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if (num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if (num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
		/*
		switch(num) {
		case 1 :
			System.out.println("1번");
			break;
		case 2 :
			System.out.println("2번");
			break;
		case 3 :
			System.out.println("3번");
			break;
		case 4 :
			System.out.println("4번");
			break;
		case 5 :
			System.out.println("5번");
			break;
		default :
			System.out.println("6번");
			break;
		}
		*/
	}

}
