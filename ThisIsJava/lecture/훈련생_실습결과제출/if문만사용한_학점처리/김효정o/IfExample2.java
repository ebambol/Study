package com.java.test1;

public class IfExample2 {
//90~100 -> A등급
//80~89  -> B등급
//70~79  -> C등급
//60~69  -> D등급
//0~60미만 -> F등급
//점수가 0~100값이 아니면 '입력값 오류'
	
	public static void main(String[] args) {
		int score = 200;
		
		if((score >= 90) && (score <= 100)) {
			System.out.println("A");
		}

		if((score >= 80) && (score <= 89)) {
			System.out.println("B");
		}

		if((score >= 70) && (score <= 79)) {
			System.out.println("C");
		}

		if((score >= 60) && (score <= 69)) {
			System.out.println("D");
		}

		if((score >= 0) && (score < 60)) {
			System.out.println("F");
		}

		if(!(score >= 0) || !(score <=100)) {
			System.out.println("!입력값 오류! 잘못 입력 하셨습니다.");
	    }
    }
	
}