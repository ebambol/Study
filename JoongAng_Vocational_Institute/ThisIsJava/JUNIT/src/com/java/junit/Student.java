package com.java.junit;

public class Student {
	String name;	//�л��̸�
	int kor;	//�����
	int eng;	//�����
	int mat;	//���м���
	int sum;	//�հ�
	double avg; //���
	char grade;
	boolean chksum;
	boolean chkavg;
	boolean chkgrade;
	
	//������
	public Student() { }
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//�޼ҵ�
	public void sum() {
		System.out.println("sum() �޼ҵ� ����!");
		chksum = true;
		sum = kor+eng+mat;
	}
	
	public void report() {
		System.out.println("===============================");
		System.out.println("name : "+name+ "�� ���� ���");
		System.out.println("����� : "+kor);
		System.out.println("����� : " + eng);
		System.out.println("���м��� : " + mat);
		System.out.println("�հ�  : " + sum);
		System.out.println("===============================");
	}
}
