package com.java.test6;

public class StringBuilderExample {
	public static void main(String[] args) {
		//���� ũ�� ����
		StringBuilder sb = new StringBuilder(50);
		
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb.toString());	//Java Program Study
		System.out.println(sb);	//Java Program Study
		//sb[5]�� ��ġ���� �� ���ڿ��� ����
		System.out.println("�� ���ڿ� : " + sb.substring(5));	//Program Study
		//����ũ��
		System.out.println("���� ũ�� : " + sb.capacity());	//50
		//���ڿ� ����
		System.out.println("���ڿ� ���� : " + sb.length());	//18
		//"P"�� �ε��� ��ġ
		System.out.println("P�� �ε��� ��ġ : " +sb.indexOf("P"));	//5
		//sb[4]�� 123�߰�
		System.out.println("index[4]�� 123 �߰� : " + sb.insert(4, 123));	//Java123 Program Study
		//sb[4]���� 21���� ����
		System.out.println("index[5]���� [21]���� ���� : " + sb.delete(5, 21));	//Java1
		//sb[4] ���� ����
		System.out.println("index[4]���� ���� : " + sb.deleteCharAt(4));	//Java
		//sb[4]���� [30]���� ������ " book" �߰�
		System.out.println("index[4]���� [30]������ book �߰� : " + sb.replace(4, 30, " book"));	//Java book
		//"k"���� ó������ �ε��� ����
		System.out.println("k���� ó������ index ���� : " + sb.lastIndexOf("k"));	//8



		//���ڿ� �Ųٷ�
		System.out.println("���ڿ� �Ųٷ� ��� : " + sb.reverse());	//koob avaJ
		
	}
}
