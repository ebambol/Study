package com.java.test1;

public class ConditionalOperationExample2 {
	public static void main (String[] args) {
		int score = 58;	//점수가 60이상이면 '합격' 그렇지 않으면 '불합격'
		String grade = (score >60) ? "합격" : "불합격";
		System.out.println(score + "점은 " + grade + "입니다.");
	}
}
