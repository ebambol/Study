package com.java.vending;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class VendingMachineImprove {
	public static void main(String[] args) throws IOException{
		int password = 123456; // 관리자 모드 진입용
		Scanner sc = new Scanner(System.in);
		JuiceCategoryImprove jci = new JuiceCategoryImprove();
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //관리자 모드 선택 수정용(미완)
		*문제점: 음료 수량 선택시 문자 입력하면 예외 발생(수정완료) / 구매절차 선택 시 문자 입력하면 예외 발생(수정완료) / (표정렬용 이름) 문자열이 2개 이하일 때 "\t"자동으로 붙이는 기능 추가하기(완)
		*|'종류' '수량' '가격' 입력(띄어쓰기로 구분)> 형식에서 벗어났을 경우 java.lang.NumberFormatException 발생
		*추가할 기능: juiceCategory클래스가 아니라 관리자 모드에서 진열개수 변경하기()
		*/

		do {
			jci.printJuice();
			int juiceSelect = 1;
			boolean exit = true;
			while(true) {
				try {
					juiceSelect = sc.nextInt();
					break;
				}
				catch(InputMismatchException ime) {
					sc = new Scanner(System.in);
					System.out.print("잘못된 입력입니다(정수만 입력가능)"+"\n|다시 입력해주세요> ");
				}
			}

			if(juiceSelect != password) { //지정 password입력시 관리자 모드 실행 

				do {
					if(juiceSelect>0 && juiceSelect<=jci.juiceCategory.length) {
						jci.cal1(juiceSelect); // 선택한 음료수의 수량과 구매할 수량을 비교해서 결과값 산출
						jci.cal2(juiceSelect); // 구매가능 수량 참조
						exit = false; // do 반복문 탈출
					} else {
						System.out.print("잘못된 입력입니다."+"\n|다시 입력해주세요> ");
						juiceSelect = sc.nextInt();
					}

				} while(exit);
				exit = true;

				int totalPrice = 0; //음료수 가격 총합 계산을 위한 변수
				int cash=0; // 사용자의 투입 금액 계산을 위한 변수

				do {
					System.out.print("|결제하기: 1 |추가하기: 2 |취소하기: 3\n|구매절차 과정 중 하나를 입력해주세요> ");	

					while(true) {
						try {
							int buyProcess = sc.nextInt();
							if(buyProcess>0 && buyProcess<4) {
								switch(buyProcess) {
								case 1:
									for(int i=0;i<jci.willAmount.length;i++) { //음료 선택 후 바로 결제하기를 선택했을 때 및 |2.추가하기|로 다른 음료를 추가했을 때에도 총액 합산하기
										totalPrice += jci.juicePrice[i]*jci.willAmount[i];
									}
									jci.printJuiceReserve1(); // |2.추가하기| 이전에 선택한 구매예정 음료수들을 보여줌

									System.out.print("\n결제금액: "+totalPrice+"\n|현금을 투입해주세요> ");
									cash = sc.nextInt(); //사용자 투입 금액 입력
									System.out.println("투입금액: "+cash);

									do {
										if(cash>=totalPrice) {
											jci.changeJuiceNumber(); // 사용자가 구매한 음료수의 개수만큼 남은 수량에서 제외
											jci.changeWillAmount();  // 사용자가 구매하려는 음료 각각의 개수를 다시 0으로 초기화

											System.out.println("거스름돈: "+(cash-totalPrice));
											break;
										} else {
											System.out.print("---금액이 부족합니다---\n|현재금액: "+cash+" |필요금액: "+((totalPrice)-cash)+"\n|현금추가하기> ");
											cash += sc.nextInt(); //이전 사용자의 투입 금액과 합산해 새로운 cash 설정
											System.out.println("투입금액: "+cash);
										}
									} while(true);
									exit = false; //구매절차 과정을 탈출하고 '15라인'으로 회귀
									break;

								case 2:	
									jci.printJuiceReserve2();
									System.out.print("|추가하실 음료수를 선택해주세요> ");
									do {
										while(true) {
											try {
												juiceSelect = sc.nextInt();
												break;
											}
											catch(InputMismatchException ime) {
												sc = new Scanner(System.in);
												System.out.print("잘못된 입력입니다(정수만 입력가능)"+"\n|다시 입력해주세요> ");
											}
										}

										if(juiceSelect>0 && juiceSelect<=jci.juiceCategory.length) {
											jci.cal1(juiceSelect); //선택한 음료수의 수량과 구매할 수량을 비교해서 결과값 산출
											jci.cal2(juiceSelect); //구매가능 수량 참조
											break;
										} else {
											System.out.print("잘못된 입력입니다."+"\n|추가하실 음료수를 다시 선택해주세요> ");
										}
									} while(true);
									break;

								case 3:
									System.out.println("주문을 취소합니다.");
									jci.changeWillAmount(); // 사용자가 선택했던 음료수들의 수량 0으로 초기화
									exit = false; 
									break;
								}
							} else {
								System.out.print("잘못된 입력입니다(구매절차 대응번호 없음)"+"\n|다시 입력해주세요> ");
								buyProcess = sc.nextInt();
							}
							break;
						}
						catch(InputMismatchException ime) {
							sc = new Scanner(System.in);
							System.out.print("잘못된 입력입니다(정수만 입력가능)"+"\n|다시 입력해주세요> ");
						}
					}
				} while(exit);

			} else { //관리자 모드 실행
				boolean exitAdmin = true;
				do {
					System.out.println("---[관리자 모드 진입]---");
					System.out.println("\t┌-------(일괄변경)------┐");
					System.out.print("|개별변경\t|종류변경\t|수량변경\t|가격변경\t|비번변경\t|종료\n입력> ");
					String manegement  = sc.next();
					switch(manegement) {
					/*case "진열개수":
						System.out.println("|진열개수 진입 완료 ");
						System.out.print("진열개수 입력> ");
						int indexNum = sc.nextInt();
						jci.newjuiceCategory(indexNum);
						System.out.println("|변경 완료");
						
						break;*/
					case "개별변경":
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("|개별변경 진입 완료 ");
						System.out.print(jci.juiceCategory.length+"행 중 변경할 위치 입력> ");
						int index;
						while(true) {
							try {
								index = Integer.parseInt(br.readLine());
								break;
							}
							catch(NumberFormatException ime) {
								br = new BufferedReader(new InputStreamReader(System.in));
								System.out.print("잘못된 입력입니다(정수만 입력가능)"+"\n|다시 입력해주세요> ");
							}
						}
						
						System.out.print("|'종류' '수량' '가격' 입력(띄어쓰기로 구분)> ");

						StringTokenizer st = new StringTokenizer(br.readLine()," ");
						jci.juiceCategory[index-1] = st.nextToken();
						jci.defineStringSize(index);
						jci.juiceAmount[index-1] = Integer.parseInt(st.nextToken());
						jci.juicePrice[index-1] = Integer.parseInt(st.nextToken());
						System.out.print("|"+(index)+". "+jci.juiceCategory[index-1]);
						System.out.println("\t|보유수량: "+jci.juiceAmount[index-1]+"\t|가격: "+jci.juicePrice[index-1]+"\t|");
						System.out.println("|변경 완료");
						break;
						
					case "종류변경":
						System.out.println("|종류변경 진입 완료 ");
						String reName = "empty";
						jci.adminSet(jci.juiceCategory, reName);
						break;
						
					case "수량변경":
						System.out.println("|수량변경 진입 완료 ");
						int reNumber = 0;
						jci.adminSet(jci.juiceAmount, reNumber);
						break;
						
					case "가격변경":
						System.out.println("|가격변경 진입 완료 ");
						int rePrice = 0;
						jci.adminSet(jci.juicePrice, rePrice);
						break;
						
					case "비번변경":
						System.out.println("|비번변경 진입 완료 ");
						System.out.print("|변경할 비밀번호를 입력해 주세요> ");
						password = sc.nextInt();
						System.out.println("|변경 완료");
						break;	
						
					case "종료":
						System.out.println("---[관리자 모드 종료]---");
						exitAdmin = false;
					}
				} while(exitAdmin);
				exitAdmin = true;

			}
		} while(true);
	}
}
