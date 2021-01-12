package com.java.test2;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		/*
		 * 가위바위보 게임
		 * 사람입력 : "가위" "바위" "보"
		 * 컴퓨터와 가위바위보를 한 결과를 출력 => "승리" "패배" "무승부"
		 * Math.random()*3 + 1 => 1이면 가위 2이면 바위 3이면 보
		 * 	게임룰: 가위<바위<보<가위<바위<보	
		 *  */
		
		System.out.println("가위바위보를 시작합니다.");
		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		System.out.println("게임을 종료하려면 Exit를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			int com = (int)(Math.random()*3 + 1);
			System.out.println("");
			System.out.println("---가위바위보게임---");
			System.out.println("입력> ");
			inputString = scanner.nextLine();
			
			if(com==1) {
				if(inputString.contentEquals("가위")) {
					System.out.println("무승부");
				}
				else if(inputString.contentEquals("바위")) {
					System.out.println("승리");
				}
				else if(inputString.contentEquals("보")) {
					System.out.println("패배");
				}
			}
			else if(com==2) {
				if(inputString.contentEquals("가위")) {
					System.out.println("패배");
				}
				else if(inputString.contentEquals("바위")) {
					System.out.println("무승부");
				}
				else if(inputString.contentEquals("보")){
					System.out.println("승리");
			}
		}
			else if(com==3) {
				if(inputString.contentEquals("가위")) {
				System.out.println("승리");
			}
			else if(inputString.contentEquals("바위")) {
				System.out.println("패배");
			}
			else if(inputString.contentEquals("보")) {
				System.out.println("무승부");
			}
			}
		}
		while(!(inputString.contentEquals("Exit")));
		System.out.println();
		System.out.println("게임을 종료합니다.");
}
}
