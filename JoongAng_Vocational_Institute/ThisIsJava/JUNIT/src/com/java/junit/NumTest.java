package com.java.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumTest {
	//필드
	Num n;

	@BeforeEach	//각각의 @Test 메소드를 실행하기 전에 실행됨
	public void setUp() throws Exception {
		System.out.println("setUp() 실행");
		n = new Num(10);
		System.out.println("setUp() 종료");
	}

	//메소드
	@Test
	public void testNum() {
		Num num = new Num(100);
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd() 실행");
//		Num n = new Num(10); 	//지역변수
		System.out.println(n.getValue());

		//assertEquals(기대값, 실행결과값);	기대값=실행결과 비교
		assertEquals(20, n.add(10));	
		//		System.out.printf("원본:%d 더하기:%d 빼기 : %d 나누기 : %d 곱하기 : %d",n.getValue(), n.add(50), n.subtract(20), n.divide(4), n.multiply(12));
		System.out.println("testAdd() 종료");
	}

	@Test
	public void testSubtract() {
		System.out.println("testSubtract() 실행");
//		Num n = new Num(10);
		assertEquals(0, n.subtract(10));	
		System.out.println("testSubtract() 종료");
	}
	
	@Test
	public void testMultiply() {
		System.out.println("testMultiply() 실행");
		assertEquals(100, n.multiply(10));
		System.out.println("testMultiply() 종료");
	}
	
	@Test
	public void testDivide() {
		System.out.println("testDivide() 실행");
		assertEquals(2, n.divide(5));
		System.out.println("testDivide() 종료");
	}
}
