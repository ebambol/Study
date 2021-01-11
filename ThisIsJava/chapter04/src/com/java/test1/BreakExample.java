package com.java.test1;

public class BreakExample {

	public static void main(String[] args) {
		while (true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
//				System.out.println(num);	//6일때 , 제거
				break;
			}
//			System.out.print(num + ", ");	//, 포함 출력
		}
		System.out.println("프로그램 종료");
	}

}
