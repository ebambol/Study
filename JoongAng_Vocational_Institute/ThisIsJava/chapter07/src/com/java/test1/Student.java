package com.java.test1;

//class�� private�� ������
//private class Student extends People{
//���� : Illegal modifier for the class Student; 
//only public, abstract & final are permitted

//class�� default�� ������
//default class Student extends People{
//���� : Syntax error on token "default", delete this token
public class Student extends People{
	public int studentNo;
	
	public Student (String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
