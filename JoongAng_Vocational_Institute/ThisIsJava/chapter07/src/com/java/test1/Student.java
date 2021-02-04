package com.java.test1;

//class를 private로 줬을때
//private class Student extends People{
//에러 : Illegal modifier for the class Student; 
//only public, abstract & final are permitted

//class를 default로 줬을때
//default class Student extends People{
//에러 : Syntax error on token "default", delete this token
public class Student extends People{
	public int studentNo;
	
	public Student (String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
