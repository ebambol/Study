package com.java.vending;

import java.util.*;

public class VendingMachine {

	public static void main(String[] args) {
		/*
		 * 자판기 만들기
		 * 1. 자판기 종류는 원하는 종류 선택 (종류 암거나)
		 * 2. 음료수를 목록(종류,가격)으로 출력 (갯수는 맘대로)
		 * 3. 돈(금액)을 넣을 수 있도록 처리
		 * 4. 음료수 종류와 음료수 갯수를 입력할 수 있도록 처리
		 * 5. 출력을 선택하면 음료수가 출력되고,
		 * 6. 거스름돈을 출력
		 * 매진, 넣는수 (할수있으면)
		 * (단, 선택한 음료수의 금액이 초과할 경우 "잔액이 부족합니다" 출력
		 */
		
		int sum = 0;
		int money = 0;
		int count = 0;
		String arr[] = {"아메리카노", "카페라떼", "레몬에이드", "딸기에이드"};
		int arr_mouth[] = {100,200,300,400};
		String arr_save[] = null;
		OUT : while(true) {
			System.out.print("음료수 종류 : ");
			for(int i=0; i<arr.length; i++) {
				System.out.print(i+1+".");
				if(i==arr.length-1) {
					System.out.print(arr[i] +" "+ arr_mouth[i]+"원");
				}else {
					System.out.print(arr[i] +" "+ arr_mouth[i]+"원, ");
				}
			}
			Scanner sc = new Scanner(System.in);
			
			boolean InWhile = true;
			while(InWhile) {
			//음료수 선택
			System.out.println();
			System.out.print("뽑고싶은 음료수 선택>");
			count++;
			int input = sc.nextInt();
			
			String[] arr_save = new String[count];
			for(int i=0; i<count; i++) {
				arr_save[i] = arr[input-1];
				System.out.println(arr_save[i]);
			}
			//음료수 갯수
			System.out.print("몇개>");
			int input_num = sc.nextInt();
			//정보표시
			System.out.println("니가 고른 음료수 : " + arr[input-1] + ", 갯수 : " +input_num + " 가격 : " + (sum + arr_mouth[input-1] * input_num));
			System.out.print("뽑는다? (y/n)>");
			String output = sc.next();
			if(output.equals("y")) {

			//돈 입력
			System.out.print("돈줘>");
			money = sc.nextInt();
			System.out.println("투입 금액 " + money);
				int money_di = money - (arr_mouth[input-1]*input_num);
				System.out.println(arr_mouth[input-1]*input_num);
				System.out.println("거스름돈 : " + money_di);
				break OUT;
			} else {
				sum+= (arr_mouth[input-1] * input_num);
				continue;
			}
			
			}
//			//돈 입력
//			System.out.print("돈줘>");
//			money = sc.nextInt();
//			System.out.println("투입 금액 " + money);
			
			//출력확인
//			System.out.println("뽑는다? (y/n)");
//			String output = sc.next();
//			if(output.equals("y")) {
//				int money_di = money - (arr_mouth[input-1]*input_num);
//				System.out.println(arr_mouth[input-1]*input_num);
//				System.out.println("거스름돈 : " + money_di);
//				break;
//			} else {
//				continue;
//			}

			//거스름돈 계산
//			int money_di = money - (arr_mouth[input-1]*input_num);
//			System.out.println(arr_mouth[input-1]*input_num);
//			System.out.println("거스름돈 : " + money_di);
//			
			
//			break;	//종료용
		}
		System.out.println("영업 끝남 나가슈");

	}

}
