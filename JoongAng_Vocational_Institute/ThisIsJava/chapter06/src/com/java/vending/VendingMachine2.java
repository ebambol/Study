package com.java.vending;

import java.util.*;

public class VendingMachine2 {

	public static void main(String[] args) {
		
		int input = 0;
		int money = 0;
		int sum = 0;
		String[] goods = {"콜라", "사이다", "물"};
		int[] price = {2000, 1000, 500};
		Scanner sc = new Scanner(System.in);
		String loopOut;
		while (true) {
			
			//상품 출력
//			System.out.println("sum: " + sum);
			for(int i=0; i<goods.length; i++) {
				System.out.print(i+1+".");
				if(i==goods.length-1) {
					System.out.println(goods[i] + " " + price[i] + "원");
				}else {
					System.out.print(goods[i] + " " + price[i] + "원" + ", ");
				}
			}
			//입력받기
			System.out.print("선택>");
			input = sc.nextInt();
			
			System.out.print("몇개?>");
			int input_num = sc.nextInt();
			
			//가격 계산
			sum += (price[input-1] * input_num);
			
			
			//종료
			System.out.println("더 뽑을래? y/n");
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
			if(money>sum) {
				System.out.print("거스름돈 > ");
				int result = money - sum;
				int[] moneyReturn = {50000,10000,5000,1000,500,100};
				for(int i=0; i<moneyReturn.length; i++) {
					int namuji = result/moneyReturn[i];
					result = result-(namuji*moneyReturn[i]);
					if(namuji!=0) {
						System.out.print(moneyReturn[i]+ "원:" + namuji + " ");
					}
				}
				System.out.println("음료수 나옴");
			}
		} else {
			System.out.println("돈이 부족해");
		}
	}

}
