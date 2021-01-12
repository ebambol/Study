
package com.java.teat1;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
	/*
	 *  가위 바위 보게임
	 *  사람 입력: "가위", "바위", "보"
	 *  컴퓨터와 가위바위보를 한 결과를 출력 -> "승리","패배","무승부"
	 *  Math.random() -> 1이 나오면 -> "가위", 2-> "바위", 3-> "보"
	 *  게임룰 : 가위<바위<보<가위<바위<보
	 */

		      
		      String user1;
		      Scanner scanner = new Scanner(System.in);
		      
		      do {
		         System.out.print("사람이 낸 것 : ");
		         
		         user1 = scanner.nextLine();
		         int user = 0;
		         
		         if(user1.equals("가위")) {
		            user = 1;
		         } else if(user1.equals("바위")) {
		            user = 2;
		         } else if(user1.equals("보")) {
		            user = 3;
		         } else {
		            System.out.println("잘 못 입력했어요!"); }
		         
		         int computer = (int)(Math.random()*3)+1;
		         System.out.print("컴퓨터가 낸 것 : ");
		          
		         
		         if(computer == 1) {
		        	 System.out.println("가위");
		         	} else if(computer == 2) {
		        		 System.out.println("바위");
		        	} else {
		        			 System.out.println("보");
		        	}
		         
		         
		         if(user == computer) {
						System.out.println("무승부");
					} else if(user == 1 && computer == 2) { // 가위 : 바위
						System.out.println("컴퓨터의 승리");
					} else if(user == 1 && computer == 3) { // 가위 : 보
						System.out.println("사람의 승리");
					} else if(user == 2 && computer == 1) { // 바위 : 가위
						System.out.println("사람의 승리");
					} else if(user == 2 && computer == 3) { // 바위 : 보
						System.out.println("컴퓨터의 승리");
					} else if(user == 3 && computer == 1) { // 보 : 가위
						System.out.println("컴퓨터의 승리");
					} else if(user == 3 && computer == 2) {  // 보 : 바위 
						System.out.println("사람의 승리");  
					}

		      	} while (true);
	}
}
