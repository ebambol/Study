package test2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import test2.Student;

class TestStudent {
	Student student;

	@BeforeEach
	public void set() throws Exception {
		student = new Student("이순신", 90, 98, 95);
	}
	
	@Test
	public void name() {
		assertEquals("이순신", student.name);
	}
	@Test
	public void kor() {
		assertEquals(90, student.kor);
	}
	@Test
	public void eng() {
		assertEquals(98, student.eng);
	}
	@Test
	public void mat() {
		assertEquals(95, student.mat);
	}
	@Test
	public void sum() {
		student.sum();
		assertEquals(283,student.sum);
	}
	@Test
	public void avg() {
		student.sum();
		student.avg();
		if(student.chkavg == true) {
			assertEquals(94, student.avg);
			student.grade();
			student.report();
		}
	}
}
