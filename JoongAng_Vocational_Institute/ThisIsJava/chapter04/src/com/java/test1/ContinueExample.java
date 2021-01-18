package com.java.test1;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
//			if(i%2!=0) {	//0이 아니면 true, 0이면 false
			if(i%2==1) {	//나머지가 1이면 홀수 , 0이면 짝수	
				System.out.println(i +" 홀수 continue");
				continue;	//for-증감식 while-조건식
			}
			System.out.println(i);
		}
	}

}
