package com.java.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumTest {
	//�ʵ�
	Num n;

	@BeforeEach	//������ @Test �޼ҵ带 �����ϱ� ���� �����
	public void setUp() throws Exception {
		System.out.println("setUp() ����");
		n = new Num(10);
		System.out.println("setUp() ����");
	}

	//�޼ҵ�
	@Test
	public void testNum() {
		Num num = new Num(100);
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd() ����");
//		Num n = new Num(10); 	//��������
		System.out.println(n.getValue());

		//assertEquals(��밪, ��������);	��밪=������ ��
		assertEquals(20, n.add(10));	
		//		System.out.printf("����:%d ���ϱ�:%d ���� : %d ������ : %d ���ϱ� : %d",n.getValue(), n.add(50), n.subtract(20), n.divide(4), n.multiply(12));
		System.out.println("testAdd() ����");
	}

	@Test
	public void testSubtract() {
		System.out.println("testSubtract() ����");
//		Num n = new Num(10);
		assertEquals(0, n.subtract(10));	
		System.out.println("testSubtract() ����");
	}
	
	@Test
	public void testMultiply() {
		System.out.println("testMultiply() ����");
		assertEquals(100, n.multiply(10));
		System.out.println("testMultiply() ����");
	}
	
	@Test
	public void testDivide() {
		System.out.println("testDivide() ����");
		assertEquals(2, n.divide(5));
		System.out.println("testDivide() ����");
	}
}
