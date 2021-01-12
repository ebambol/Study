package com.java.test1;

import java.util.Scanner;

public class RockPaperScissors {
	/*
	 * 가위바위보 게임
	 * 입력 : "가위","바위","보"
	 * 컴퓨터와 가위바위보를 한 결과 출력 =>"승리","패배"
	 * Math.random() => 1=>"가위", 2=>"바위" 3=>"보"
	 * 게임룰 : 가위<바위<보
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	//Scanner 호출

		while (true) { 
			int num = 0;	//입력받은거 1~3숫자 넣는곳
			int com = (int)(Math.random()*3)+1;	//1~3 랜덤값
			String comresult = null;	//컴퓨터 결과 문자열
//			System.out.println(com);	//확인용
			System.out.println("======================================");
			System.out.println("가위바위보 게임 (가위, 바위, 보 중 하나 입력해주세요)");
			System.out.println("종료하기 : n 입력");
			System.out.println("======================================");
			System.out.print(">");

			String input = sc.nextLine();	//입력값 input에 저장

			//사용자 입력
			if(input.equals("n")) {
				System.out.println("=================게임종료================");
				break;	//n 입력시 종료
			}else if(input.equals("가위")) {	//문자열이 "가위"와 같은지 비교
				num=1;	//가위 = 1
			}else if(input.equals("바위")) {
				num=2;	//바위 = 2
			}else if(input.equals("보")) {
				num=3;	//보 = 3
			}else {
				System.out.println("다시입력");
				continue;
			}
			//com값 문자열로 변경
			switch (com) {
			case 1:
				comresult = "가위";
				break;
			case 2:
				comresult = "바위";
				break;
			case 3:
				comresult = "보";
				break;
			}
			
			//출력
			System.out.println("--------------------------------------");
			System.out.println(">>>>> 나: [" +input +"]  vs  "+ "컴: [" + comresult + "] <<<<<");
			//승패 확인
			if(num==com) {
				System.out.println("[비겼습니다.]");
			}else if((num== 1&&com==2)||(num==2&&com==3)||(num==3&&com==1)) {
				System.out.println("[패배]");
			}else if((num==1&&com==3)||(num==2&&com==1)||(num==3&&com==2)) {
				System.out.println("[승리]");
			}
			System.out.println("--------------------------------------");
		}
	}
}
//			
//			switch (num) {
//			case 1:
//				if(com==2) {
//					System.out.println("패배");
//				}else if(com==3){
//					System.out.println("승리");
//				}
//				break;
//			case 2:
//				if(com==3) {
//					System.out.println("패배");
//				}else if(com==1){
//					System.out.println("승리");
//				}
//				break;
//			case 3:
//				if(com==1) {
//					System.out.println("패배");
//				}else if(com==2){
//					System.out.println("승리");
//				}
//				break;



