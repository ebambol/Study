package com.java.test;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run =true;
		int studentNum = 0;
		int[] scores = null;	//null값이라 new생성자 필요
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];	//이거 위치 조심!!! for문에 들어가면 안됨
			}else if (selectNo == 2) {
				for (int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = scanner.nextInt();
				}
			}else if (selectNo == 3) {
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores["+i+"]:" + scores[i]);
				}
			}else if (selectNo == 4) {
				int max=Integer.MIN_VALUE;	//최대값
				int sum =0;	//성적합계
				for(int i=0; i<studentNum; i++) {
					sum += scores[i];
					if(max<scores[i]) {
						max = scores[i];
					}
				}
//				double avg = (double)sum/studentNum;
				double avg = (double)sum/scores.length; 
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + avg);

			}else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}