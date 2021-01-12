package com.java.test1;
public class P114_Lotto {
//로또번호 발생기를 실행했을 때 중복값이 나오지 않도록 프로그램을 수정하기!!!
	public static void main(String[] args) {
		int lnum1 , lnum2 , lnum3 , lnum4 , lnum5 , lnum6;
			lnum1 = (int)((Math.random()*45)+1);
			lnum2 = (int)((Math.random()*45)+1);
			lnum3 = (int)((Math.random()*45)+1);
			lnum4 = (int)((Math.random()*45)+1);
			lnum5 = (int)((Math.random()*45)+1);
			lnum6 = (int)((Math.random()*45)+1);
			for(int i = 0; (lnum2 == lnum1); i++) {
				lnum2 = (int)((Math.random()*45)+1);
			}
			for(int i = 0; (lnum3 == lnum1)||(lnum3 == lnum2); i++) {
				lnum3 = (int)((Math.random()*45)+1);
			}
			for(int i = 0; (lnum4 == lnum1)||(lnum4 == lnum2)||(lnum4 == lnum3); i++) {
				lnum4 = (int)((Math.random()*45)+1);
			}
			for(int i = 0; (lnum5 == lnum1)||(lnum5 == lnum2)||(lnum5 == lnum3)||(lnum5 == lnum4); i++) {
				lnum5 = (int)((Math.random()*45)+1);
			}
			for(int i = 0; (lnum6 == lnum1)||(lnum6 == lnum2)||(lnum6 == lnum3)||(lnum6 == lnum4)||(lnum6 == lnum5); i++) {
				lnum6 = (int)((Math.random()*45)+1);
			}
		System.out.print("번호 :" + lnum1 + "," + lnum2 + "," + lnum3 + "," + lnum4 + "," + lnum5 + "," + lnum6);
	}
}