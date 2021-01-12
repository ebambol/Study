package com.java.test1;

import java.util.Scanner;
public class RocPaeperSicisor2 {
 public static void main(String[]args) {
/* 가위바위보 게임
 * 입력 : 가위 , 바위 , 보   nextLine 이용
 * 컴퓨터와 가위바위보 한 결과를 출력 => "승리" "패배" : 무승부 
 * Math.random() => 1.가위 2.바위 3.보	
 * 가위<바위<보<가위 
 * (user1==가위 && coms==가위) (user1==바위 && coms==가위)  (user1==보 && coms==가위)x
 * (user1==가위 && coms==바위) (user1==바위 && coms==바위) (user1==보 && coms==바위)
 * (user1==가위 && coms==보)  (user1==바위 && coms==보) (user1==보 && coms==보)
 * 승리 = 
 * String a =equals.x
 *  */
	 Scanner cs = new Scanner(System.in);
		int com;
		String coms;
		String user;
		String ai;
		String result;
		
		System.out.println("가위 / 바위 / 보 ");
		do{ 
			com = (int)(Math.random()*3)+1;  //컴퓨터 입력값 랜덤설정
			System.out.println("사용자 입력 :");
			user = cs.nextLine();    // 사용자 입력값
		if (com == 1) {               // 컴퓨터 입력값 단위변환
			coms = "가위";
			System.out.println("컴퓨터 입력 :"+coms);
			ai =user;
			switch(ai) {                    //승패 결과
			 case "가위": 
				System.out.println("무승부");
				break;
			 case "바위":
				 System.out.println("승리");
				 break;
			 case "보":
			 System.out.println("패배");
			 break;
			}
			}
		 if (com == 2) { 
				coms = "바위";
				
				System.out.println("컴퓨터 입력 :"+coms);
				ai =user;
				switch(ai) {
				 case "가위": 
					System.out.println("패배");
					break;
				 case "바위":
					 System.out.println("무승부");
					 break;
				 case "보":
				 System.out.println("승리");
				 break;
				}}
		 if (com == 3)  {
				coms = "보";
				System.out.println("컴퓨터 입력 :"+ coms);
				ai =user;
				switch(ai) {
				 case "가위": 
					System.out.println("승리");
					break;
				 case "바위":
					 System.out.println("패배");
					 break;
				 case "보":
				 System.out.println("무승부");
				 break;
				}
				}
			}while(! user.equals("q"));
			    System.out.println();
			    System.out.println("program end");
 } 
}