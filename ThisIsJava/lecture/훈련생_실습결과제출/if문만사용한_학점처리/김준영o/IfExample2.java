package com.java.example;
public class IfExample2 {
	public static void main(String[] args) {
		int score = 59;
		
		if(score>100) {
			System.out.println("입력값오류! 100초과의 수 입니다. ");
		}
		
		if(score<0) {
			System.out.println("입력값오류! 0미만의 수 입니다.");
		}
		
		if(score<=100)
			if(score>=90) {
				System.out.println("점수가 100 ~ 90점 A등급 입니다.");
		}
		
		if(score<90)
			if(score>=80) {
			System.out.println("점수가 90 ~ 80점 B등급입니다.");
		}
		
		if(score<80)
			if(score>=70) {
			System.out.println("점수가 80 ~ 70점 C등급입니다.");
		}
		
		if(score<70)
			if(score>=60) {
			System.out.println("점수가 70 ~ 60점 D등급 입니다.");
		}
		
		if(score<60) 
			if(score>0) {
			System.out.println("점수가 60점미만 F등급 입니다.낙제!!");
		}
		


		/*
		 * if((score<=100)&&(score>=90)) {
		 * 
		 * System.out.println("점수가 100 ~ 90점 입니다."); System.out.println("등급은 A등급 입니다.");
		 * 
		 * }if((score<=90)&&score>=80) {
		 * 
		 * System.out.println("점수가 89 ~ 80점 입니다."); System.out.println("등급은 B등급 입니다.");
		 * 
		 * }if((score<=80)&&score>=70) {
		 * 
		 * System.out.println("점수가 79 ~ 70점 입니다."); System.out.println("등급은 C등급 입니다.");
		 * 
		 * }if((score<=70)&&score>=60){
		 * 
		 * System.out.println("점수가 69 ~ 60점 입니다"); System.out.println("등급은 D등급 입니다.");
		 * 
		 * }if((score>=0)&&score<60){
		 * 
		 * System.out.println("점수가 60점 미만입니다"); System.out.println("등급은 F등급 입니다.");
		 * 
		 * }if((score>=100)||(score<=0)){ System.out.println("입력값오류"); }
		 */
	}
}