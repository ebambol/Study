//2020-12-30 이현국
package com.java.test1;

public class Lotto {

	public static void main(String[] args) {
		int lnum1 = 0;	// 로또 당첨번호 변수 (lnum1~6) + 보너스 (bonus)
		int lnum2 = 0;
		int lnum3 = 0;
		int lnum4 = 0;
		int lnum5 = 0;
		int lnum6 = 0;
		int bonus = 0;
		int i = 0;	//카운터변수
		
//		for(i=0; i<7;) {	//for문 (사용시 while 18번줄 주석)
//		do {				//do-while (사용시 45번줄 주석 풀기 	//for,while 16번줄  18번줄 주석 )
		while (i<7) {	//0~6까지 7번 돌림 오류시 몇번더
			int num = (int)(Math.random()*45)+1;	//번호생성
			//중복확인			//switch문의 괄호에는 정수타입,String만 변수로 들어가서 못만듬
			if(lnum1 != num && lnum2 != num &&lnum3 != num &&lnum4 != num &&lnum5 != num &&lnum6 != num && bonus != num) {
				//초기값(0)과 같으면 num값으로 초기화
				if(lnum1 == 0) {
					lnum1 = num;
				}else if (lnum2 == 0) {
					lnum2 = num;
				}else if (lnum3 == 0) {
					lnum3 = num;
				}else if (lnum4 == 0) {
					lnum4 = num;
				}else if (lnum5 == 0) {
					lnum5 = num;
				}else if (lnum6 == 0) {
					lnum6 = num;
				}else {
					bonus = num;
				}
			}
			//0이 나왔을때 카운터 변수 -1 (lnum1은 루프후 0이 들어갈수 없어 생략)	//실행문이 한줄이라 블럭({})생략가능하지만 가독성안좋고 , 버그 생길수도 있음
			if(bonus == 0 || lnum6 == 0 || lnum5 ==0 || lnum4 ==0 || lnum3 ==0 || lnum2 ==0) {
				i--;
			}
			i++;	//카운터 변수 +1
		} 
//		while(i<7);		//do while의 while 부분
		//출력
		System.out.println("당첨번호 : " +lnum1+ " " +lnum2+ " " +lnum3+ " " +lnum4+ " " +lnum5+ " " +lnum6+ " + 보너스: " +bonus);
	}
}
