package com.java.vending;

import java.util.InputMismatchException;
import java.util.Scanner;
public class JuiceCategoryImprove {
	
	String[] juiceCategory;// = {"콜라", "스프라이트", "환타", "레드불", "네스카페", "립톤", "마운틴듀", "트로피카나"}; // 종류
	String[] juiceName;// = {"콜라", "스프라이트", "환타", "레드불", "네스카페", "립톤", "마운틴듀", "트로피카나"}; // 종류
	int[] juiceAmount;// = {20, 15, 15, 10, 10, 12, 8, 14}; // 재고 수량
	int[] willAmount;// = {0, 0, 0, 0, 0, 0, 0, 0}; // 사용자가 구매하려는 음료 각각의 개수 저장용
	int[] juicePrice;// = {500, 500, 500, 1200, 1000, 700, 600, 900}; // 음료 가격
		
	JuiceCategoryImprove(){
		juiceCategory = new String[] {"콜라", "스프라이트", "환타", "레드불", "네스카페", "립톤", "마운틴듀", "트로피카나"};
		juiceName = new String[] {"콜라", "스프라이트", "환타", "레드불", "네스카페", "립톤", "마운틴듀", "트로피카나"};
		juiceAmount = new int[] {20, 15, 15, 10, 10, 12, 8, 14}; // 재고 수량
		willAmount = new int[] {0, 0, 0, 0, 0, 0, 0, 0}; // 사용자가 구매하려는 음료 각각의 개수 저장용
		juicePrice = new int[] {500, 500, 500, 1200, 1000, 700, 600, 900}; // 음료 가격
	}
	
	void printJuice() {
		System.out.println("---[음료자판기]---");
		System.out.println("-------------------------------------------------");
		for(int i=0;i<juiceCategory.length;i++) {
			this.defineStringSize(i+1);
			System.out.print("|"+(i+1)+". "+juiceName[i]);
			System.out.println("\t|보유수량: "+juiceAmount[i]+"\t|가격: "+juicePrice[i]+"\t|");
		}
		System.out.println("-------------------------------------------------");
		System.out.print("(관리자 모드 진입 가능)\n|음료수를 선택해주세요> ");
	}

	void printJuiceReserve1() { // 선택한 음료수를 보여줌
		for(int i=0;i<this.willAmount.length;i++) { 
			if(this.willAmount[i]!=0) {
				if(this.juiceAmount[i]!=0) {
					System.out.print(this.juiceCategory[i]+this.willAmount[i]+"개 | ");
				}
			}
		}
	}

	void printJuiceReserve2() { // |2.추가하기| 이전에 선택한 음료수들을 보여줌
		System.out.print("|구매예정 음료수: ");
		for(int i=0;i<this.willAmount.length;i++) { 
			if(this.willAmount[i]!=0) {
				if(this.juiceAmount[i]!=0) {
					System.out.print(this.juiceCategory[i]+this.willAmount[i]+"개| ");
				}
			}
		}
		System.out.println();
	}
	// 선택한 음료수의 수량과 구매할 수량을 비교해서 결과값 산출
	int cal1(int juiceSelect) { 
		Scanner sc = new Scanner(System.in);

		do {
			if(this.juiceAmount[juiceSelect-1]-this.willAmount[juiceSelect-1]!=0) {
				int checkNum = 0; // 구매할 수량 입력
				System.out.print(" ["+this.juiceCategory[juiceSelect-1]+"] 선택 "+" | 구매가능수량: "+(this.juiceAmount[juiceSelect-1]-this.willAmount[juiceSelect-1])+"개"+"\n|수량을 입력해주세요> ");
				while(true) {
					try {
						checkNum = sc.nextInt();
						if(this.juiceAmount[juiceSelect-1]>=this.willAmount[juiceSelect-1]+checkNum) {
							this.willAmount[juiceSelect-1] += checkNum;
							return willAmount[juiceSelect-1];
						} else { 
							if(0>this.juiceAmount[juiceSelect-1]-(this.willAmount[juiceSelect-1]+checkNum)) {
								System.out.println("---구매가능수량을 초과하였습니다---");
							}
							else if(0==this.juiceAmount[juiceSelect-1]-(this.willAmount[juiceSelect-1]+checkNum)) {
								System.out.println(this.juiceCategory[juiceSelect-1]+" 구매가능한 음료수가 없습니다.\n");
								return 0;
							}
						}
						break;
					}
					catch(InputMismatchException ime) {
						sc = new Scanner(System.in);
						System.out.print("잘못된 입력입니다(정수만 입력가능)"+"\n|수량을 입력해주세요> ");
					}
				}
			} else {
				System.out.println("---구매가능수량을 초과하였습니다---");
				return 0;
			}
		} while(true);
	}
	// 구매가능 수량 참조
	int cal2(int juiceSelect) { 
		Scanner sc = new Scanner(System.in);
		do {
			if((this.willAmount[juiceSelect-1]>this.juiceAmount[juiceSelect-1])&&this.juiceAmount[juiceSelect-1]!=0) {
				System.out.println("---구매가능수량을 초과하였습니다---\n구매가능수량: "+this.juiceAmount[juiceSelect-1]+"개");
				System.out.print(this.juiceCategory[juiceSelect-1]+"\n수량을 입력해주세요> ");
				this.willAmount[juiceSelect-1] += sc.nextInt();
			} else if(this.juiceAmount[juiceSelect-1]==0){
				System.out.println(this.juiceCategory[juiceSelect-1]+" 재고가 부족합니다.\n");
				return 0;
			} else {
				System.out.println(" ["+this.juiceCategory[juiceSelect-1]+"] "+this.willAmount[juiceSelect-1]+"개를 선택하셨습니다\n|판매금액: "+this.juicePrice[juiceSelect-1]*this.willAmount[juiceSelect-1]);
				System.out.println("|남은 구매 수량: "+(this.juiceAmount[juiceSelect-1]-this.willAmount[juiceSelect-1]));
				return willAmount[juiceSelect-1];
			}
		} while(true);
	}
	// 사용자가 구매한 음료수의 개수만큼 남은 수량에서 제외
	void changeJuiceNumber() {
		for(int i=0;i<this.willAmount.length;i++) { 
			if(this.willAmount[i]!=0) {
				if(this.juiceAmount[i]>0) {
					System.out.println(this.juiceCategory[i]+" "+this.willAmount[i]+"개 구매완료");
					this.juiceAmount[i]-=this.willAmount[i];
				} else {
					this.juiceAmount[i]=0;
				}
			}
		}
	}
	// 사용자가 선택했던 음료수들의 수량 0으로 초기화 메소드
	void changeWillAmount() {
		for(int i=0;i<this.willAmount.length;i++) { 
			this.willAmount[i] = 0;
		}
	}
	//관리자 모드 음료 종류 변경
	void adminSet(String[] setting, String a){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<setting.length;i++){
			System.out.print((i+1)+"번 변경>");
			a = sc.next();
			setting[i] = a;
			this.juiceCategory[i] = a;
			this.juiceName[i] = a;
			System.out.println((i+1)+"번 '"+setting[i]+"' 변경 완료");
			this.defineStringSize(i);
		}
	}
	//관리자 모드 음료 수량, 가격 변경
	void adminSet(int[] setting, int a){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<setting.length;i++){
			System.out.print((i+1)+"번 변경>");
			a = sc.nextInt();
			setting[i] = a;
			System.out.println((i+1)+"번 '"+setting[i]+"' 변경 완료");
		}
	}
		
	void defineStringSize(int index) {
		if(this.juiceCategory[index-1].length()<=2) {
			this.juiceName[index-1] = this.juiceCategory[index-1]+"\t";
		}else {
			this.juiceName[index-1] = this.juiceCategory[index-1];
		}
		
	}
}
