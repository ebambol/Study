package com.java.test1;
import java.util.Scanner;

public class RockPaperScissors {
	// 가위바위보 게임
	// 입력은 "가위", "바위", "보"
	// 컴퓨터와 가위바위보를 한 결과를 출력 "승리", "패배", "무승부"
	// 컴퓨터는 난수로 Math.random() -> 1 : "가위", 2 : "바위", 3 : "보"
	// 룰 : 가위<바위<보<가위...
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input; // 입력
		String comOut; // 컴퓨터 출력
		
		System.out.println("*** 컴퓨터와 가위바위보 게임 ***");
		
		while(true) { // while문을 무한 반복시키되 올바른 입력값을 받을 시 break문으로 탈출
			System.out.println("----------------------");
			System.out.println(" 가위, 바위, 보 중 하나를 입력하세요");
			System.out.println("종료를 원하시면 q를 입력하세요");
			System.out.print("입력 >");
			input = scanner.nextLine();
			if(input.equals("가위")) {
				System.out.println("가위가 입력되었습니다.");
				System.out.println();
				break;
			} else if(input.equals("바위")) {
				System.out.println("바위가 입력되었습니다.");
				System.out.println();
				break;
			} else if(input.equals("보")){
				System.out.println("보가 입력되었습니다.");
				System.out.println();
				break;
			} else if(input.equals("q")){
				break;
			} else {
				System.out.println("잘못된 문자를 입력하셨습니다.");
			}
		}
		
		// switch문으로 컴퓨터 출력 구현
		int com = (int)(Math.random()*3) + 1;
		switch(com) {
		case 1:
			comOut = "가위";
			break;
		case 2:
			comOut = "바위";
			break;
		default:
			comOut = "보";
			break;
		}
		
		// 중첩if문으로 각각 경우의 수를 출력
		if(input.equals("가위")) {
			if(comOut.equals("가위")) {
				System.out.println(" 무승부 입니다.");
				System.out.println("사용자  : " + input);
				System.out.println("컴퓨터  : " + comOut);
			}
			if(comOut.equals("바위")) {
				System.out.println(" 패배 입니다.");
				System.out.println("사용자  : " + input);
				System.out.println("컴퓨터 : " + comOut);
				}
			if(comOut.equals("보")) {
				System.out.println(" 승리 입니다.");
				System.out.println("사용자  : " + input);
				System.out.println("컴퓨터 : " + comOut);
				}
		}
		if(input.equals("바위")) {
			if(comOut.equals("가위")) {
				System.out.println(" 승리 입니다.");
				System.out.println("사용자  : " + input);
				System.out.println("컴퓨터  : " + comOut);
			}
			if(comOut.equals("바위")) {
				System.out.println(" 무승부 입니다.");
				System.out.println("사용자  : " + input);
				System.out.println("컴퓨터 : " + comOut);
				}
			if(comOut.equals("보")) {
				System.out.println(" 패배 입니다.");
				System.out.println("사용자  : " + input);
				System.out.println("컴퓨터 : " + comOut);
				}
		}
		if(input.equals("보")) {
			if(comOut.equals("가위")) {
				System.out.println(" 패배 입니다.");
				System.out.println("사용자  : " + input);
				System.out.println("컴퓨터  : " + comOut);
			}
			if(comOut.equals("바위")) {
				System.out.println(" 승리 입니다.");
				System.out.println("사용자  : " + input);
				System.out.println("컴퓨터 : " + comOut);
				}
			if(comOut.equals("보")) {
				System.out.println(" 무승부 입니다.");
				System.out.println("사용자  : " + input);
				System.out.println("컴퓨터 : " + comOut);
				}
		}
		System.out.println(" 프로그램 종료");
	}
}
