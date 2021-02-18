package com.java.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {
	@Test
	public void test1() {
		Student std = new Student("이순신", 90, 95, 98);
//		assertEquals(기대값, 실행값);	값을 비교
		assertEquals("이순신", std.name);
		assertEquals(90, std.kor);
		assertEquals(95, std.eng);
		assertEquals(98, std.mat);
		assertEquals(283, std.sum);
	}
	
	@Test
	public void test2() {
		Student std = new Student("이순신", 90, 95, 98);
//		assertEquals(기대값, 실행값);	값을 비교
		assertEquals(90, std.kor);
	}
	@Test
	public void test3() {
		Student std = new Student("이순신", 90, 95, 98);
//		assertEquals(기대값, 실행값);	값을 비교
		assertEquals(95, std.eng);
	}
	@Test
	public void test4() {
		Student std = new Student("이순신", 90, 95, 98);
//		assertEquals(기대값, 실행값);	값을 비교
		assertEquals(98, std.mat);
	}
	@Test
	public void test5() {	//sum
		Student std = new Student("이순신", 90, 95, 98);
		std.sum();
		if(std.chksum == true) {
			assertEquals(283, std.sum);
			std.report();
		}

	}
}
