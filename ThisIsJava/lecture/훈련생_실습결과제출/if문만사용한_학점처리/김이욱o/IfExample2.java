package com.java.test1;
public class IfExample2 {
	public static void main(String[] args) {
		//90이상 A, 89~80 B , 79~70 C , 69~60 D , 60미만 F , 점수 0~100 사이 아니면 '입력값 오류'
		int score = 75;
		
		if(score > 100 ) {
			System.out.println("입력값 오류(100초과).");
		}
		if(score < 0 ) {
			System.out.println("입력값 오류(0미만).");
		}
		if(score >= 90 && score <=100) {
			System.out.println("점수가 90이상.");
			System.out.println("등급은 A 입니다.");
		}
		if(score >= 80 && score <= 89) {
			System.out.println("점수가 80이상.");
			System.out.println("등급은 B 입니다.");
		}
		if(score >= 70 && score <= 79) {
			System.out.println("점수가 70이상.");
			System.out.println("등급은 C 입니다.");
		}
		if(score >= 60 && score <= 69) {
			System.out.println("점수가 60이상.");
			System.out.println("등급은 D 입니다.");
		}
		if(score > 0 && score < 60) {
			System.out.println("점수가 60미만.");
			System.out.println("등급은 E 입니다.");
	    }
	}
 }

