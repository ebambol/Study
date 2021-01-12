package com.java.test1;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int win=0;
		int lose=0;
		int m=0;
		int AI=0;
		// 1=바위 2=보 3=가위
		System.out.println("가위 바위 보 게임! #3승 후 자동종료");
		
		while(win<3) {
			System.out.println("===============");
			System.out.println("가위/바위/보");
			System.out.print("나의 선택 : ");
			AI = (int)(Math.random()*3)+1;
			
			
			String inputString = sc.nextLine();
			
			
			if(inputString.equals("가위") && AI == 1) {
				lose++;
				System.out.println("상대방의 선택 : 바위");
				System.out.println("패배...");
			}if(inputString.equals("가위") && AI == 2) {
				win++;
				System.out.println("상대방의 선택 : 보");
				System.out.println("승리! " +win+"승째");
			}if(inputString.equals("가위") && AI == 3) {
				m++;
				System.out.println("상대방의 선택 : 가위");
				System.out.println("무승부");
				
				
			}if(inputString.equals("바위") && AI == 1) {
				m++;
				System.out.println("상대방의 선택 : 바위");
				System.out.println("무승부");
			}if(inputString.equals("바위") && AI == 2) {
				lose++;
				System.out.println("상대방의 선택 : 보");
				System.out.println("패배...");
			}if(inputString.equals("바위") && AI == 3) {
				win++;
				System.out.println("상대방의 선택 : 가위");
				System.out.println("승리! " +win+"승째");
				
				
			}if(inputString.equals("보") && AI == 1) {
				win++;
				System.out.println("상대방의 선택 : 바위");
				System.out.println("승리! " +win+"승째");
			}if(inputString.equals("보") && AI == 2) {
				m++;
				System.out.println("상대방의 선택 : 보");
				System.out.println("무승부");
			}if(inputString.equals("보") && AI == 3) {
				lose++;
				System.out.println("상대방의 선택 : 가위");
				System.out.println("패배...");
			}
			
		}
			
		System.out.println("당신은 "+win+"승 하셨고, "+lose+"패 하셨으며, "+m+"번의 무승부를 하셨습니다.");
	}

}
