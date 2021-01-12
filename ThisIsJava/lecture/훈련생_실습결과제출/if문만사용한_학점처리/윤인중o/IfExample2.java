package com.java.test1;

public class IfExample2 {
	public static void main(String[] args) {
		// 100 ~ 90 이면 'A'등급
		// 89 ~ 80이면 'B'등급
		// 79 ~ 70이면 'C'등급
		// 69 ~60이면 'D'등급
		// 60점 미만 이면 'F'등급
		// 점수가 0~100사이 값이 아니면 '입력값오류'
		
		int score = 100;
									
		if(score > 100) {
			System.out.println("입력값오류(100초과)");
		}		
		if(score <0) {
			System.out.println("입력값오류(0미만)");
		}		
		if(score>=90 && score<=100) {
			//System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} 
		if(score>=80 && score<90) {
			System.out.println("등급은  B 입니다.");
		}
		if(score>=70 && score<80) {
			System.out.println("등급은 C 입니다.");
		}
		if(score>=60 && score<70) {
			System.out.println("등급은 D 입니다.");
		}
		if(score<60 && score>=0) {
			System.out.println("등급은 F 입니다.");
		}
	}
}
