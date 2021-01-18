package com.java.vending;

import java.util.*;

public class VendingMachine {

	public static void main(String[] args) {


		int input = 0;
		int money = 0;
		int sum = 0;
		String[] goods = {"콜라", "사이다", "물"};
		int[] price = {2000, 1000, 500};
		int[] goodsNum = {10,10,10};
		Scanner sc = new Scanner(System.in);
		String loopOut;
		while (true) {

			//상품 출력
			//					System.out.println("sum: " + sum);
			for(int i=0; i<goods.length; i++) {
				System.out.print((i+1)+".");
//				if(i==goods.length-1) {
//					System.out.print(goods[i] + " " + price[i] + "원 " );
//				}else {
					System.out.print(goods[i] + " " + price[i] + "원" + ", ");
//				}
				System.out.print("현재 갯수: "+goodsNum[i] + " | ");
			}
			System.out.println();
			//입력받기
			System.out.print("선택>");
			input = sc.nextInt();
			if(input>3) {
				System.out.println("다시입력");
				continue;
			}
			System.out.print("몇개?>");
			int inputNum = sc.nextInt();
			if(inputNum>10||inputNum<=0) {
				System.out.println("올바른 값을 입력하세요");
				continue;
			}
			goodsNum[input-1] -= inputNum;


			//가격 계산
			sum += (price[input-1] * inputNum);

			//품절 확인
			for(int i=0; i<goodsNum.length; i++) {
				if(goodsNum[i] <=0) {
					System.out.println(goods[i]+" 품절");
				}
			}

			//종료
			System.out.print("더 뽑을래?(y/n) >");
			loopOut = sc.next();
			if(loopOut.equals("n")||loopOut.equals("N")) {
				break;
			}else if(loopOut.equals("y") || (loopOut.equals("Y"))) {
				continue;
			}
		}
		//돈 입력 받기
		System.out.println("가격:" + sum);
		System.out.print("현금 삽입>");
		money = sc.nextInt();
		if(money>=sum) {
				int result = money - sum;
				System.out.print("거스름돈 >");
				System.out.println(result);
				int[] moneyReturn = {50000,10000,5000,1000,500,100,50,10};
				for(int i=0; i<moneyReturn.length; i++) {
					int div = result/moneyReturn[i];
					result = result-(div*moneyReturn[i]);
					if(div!=0) {
						System.out.print(moneyReturn[i]+ "원:" + div + " ");
					}
				}
				System.out.println();
				System.out.println("음료수 나옴");
			} else {
			System.out.println("잔액이 부족합니다.");
		}
		
		System.out.println("프로그램 종료");
	}

}
