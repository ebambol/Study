package com.java.junit;

public class Student {
	String name;	//학생이름
	int kor;	//국어성적
	int eng;	//영어성적
	int mat;	//수학성적
	int sum;	//합계
	double avg; //평균
	char grade;
	boolean chksum;
	boolean chkavg;
	boolean chkgrade;
	
	//생성자
	public Student() { }
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//메소드
	public void sum() {
		System.out.println("sum() 메소드 실행!");
		chksum = true;
		sum = kor+eng+mat;
	}
	
	public void report() {
		System.out.println("===============================");
		System.out.println("name : "+name+ "의 성적 출력");
		System.out.println("국어성적 : "+kor);
		System.out.println("영어성적 : " + eng);
		System.out.println("수학성적 : " + mat);
		System.out.println("합계  : " + sum);
		System.out.println("===============================");
	}
}
