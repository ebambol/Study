package com.java.lotto;

import java.util.Scanner;

public class RockPaperScissors3 {
	
	public static void main(String[] args) {
					
		Scanner scanner = new Scanner(System.in);
			System.out.println("가위, 바위, 보 중에 하나는 선택하세요.");
			
		String user = scanner.next();
		
			
		int user1 = 0;
		String com1 = "";
		
		
	    int com =(int)(Math.random()*3) + 1;
	    		
		if(com == 1) {
			com1 = "가위";
		} else if(com == 2) {
			com1 = "바위";
		} else if(com == 3) {
			com1 = "보";
		}
		                                                             	
		if(user.equals("가위")) {
			user1 = 1;
			if(user1 == com) {
				System.out.println("당신은" + user + "를 냈습니다.");
				System.out.println("컴퓨터는" + com1 + "를 냈습니다.");
				System.out.println("비겼습니다.");
			} else if(user1 - com == -1) {
				System.out.println("당신은" + user + "를 냈습니다.");
				System.out.println("컴퓨터는" + com1 + "를 냈습니다.");
				System.out.println("컴퓨터의 승리입니다.");
			} else if(user1 - com == -2) {
				System.out.println("당신은" + user + "를 냈습니다.");
				System.out.println("컴퓨터는" + com1 + "를 냈습니다.");
				System.out.println("YOU WIN!!");
			}
		}
		if(user.equals("바위")) {
			user1 = 2;
			if(user1 == com) {
				System.out.println("당신은" + user + "를 냈습니다.");
				System.out.println("컴퓨터는" + com1 + "를 냈습니다.");
				System.out.println("비겼습니다.");
			} else if(user1 - com == -1) {
				System.out.println("당신은" + user + "를 냈습니다.");
				System.out.println("컴퓨터는" + com1 + "를 냈습니다.");
				System.out.println("컴퓨터의 승리입니다.");
			} else if(user1 - com == 1) {
				System.out.println("당신은" + user + "를 냈습니다.");
				System.out.println("컴퓨터는" + com1 + "를 냈습니다.");
				System.out.println("YOU WIN!!");
			}
		}
		if(user.equals("보")) {
			user1 = 3;
			if(user1 == com) {
				System.out.println("당신은" + user + "를 냈습니다.");
				System.out.println("컴퓨터는" + com1 + "를 냈습니다.");
				System.out.println("비겼습니다.");
			} else if(user1 - com == 2) {
				System.out.println("당신은" + user + "를 냈습니다.");
				System.out.println("컴퓨터는" + com1 + "를 냈습니다.");
				System.out.println("컴퓨터의 승리입니다.");
			} else if(user1 - com == 1) {
				System.out.println("당신은" + user + "를 냈습니다.");
				System.out.println("컴퓨터는" + com1 + "를 냈습니다.");
				System.out.println("YOU WIN!!");
			}
		}
		
		 	
		
	} //main
}  //class
