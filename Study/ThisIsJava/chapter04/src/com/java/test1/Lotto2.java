package com.java.test1;

public class Lotto2 {

	public static void main(String[] args) {
		int lnum1 = 0;	// 로또 당첨번호 변수 (lnum1~6) + 보너스 (bonus)
		int lnum2 = 0;
		int lnum3 = 0;
		int lnum4 = 0;
		int lnum5 = 0;
		int lnum6 = 0;
		int bonus = 0;
//		int i = 0;	//카운터변수
		for(int i =0 ; i<7 ; i++) {
//		while (i<7) {	//0~6까지 7번 돌림 오류시 몇번더
			int num = (int)(Math.random()*45)+1;	//번호생성
//			i++;	//카운터 변수 +1
			
			//중복제거
			if(lnum1 != num && lnum2 != num &&lnum3 != num &&lnum4 != num &&lnum5 != num &&lnum6 != num && bonus != num) {
				//초기값(0)과 같으면 초기화
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

			//0이 나왔을때 카운터 변수 -1 (lnum1은 0이 들어갈수 없음)
			if(bonus == 0 || lnum6 == 0 || lnum5 ==0|| lnum4 ==0|| lnum3 ==0|| lnum2 ==0) {
				i--;
			}
		}
		System.out.println("당첨번호 : " +lnum1+ " " +lnum2+ " " +lnum3+ " " +lnum4+ " " +lnum5+ " " +lnum6+ " + 보너스: " +bonus);
	}
}
