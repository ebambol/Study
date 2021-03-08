package com.java.test4;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;

		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);

		System.out.println("emp가 최종적으로 참조하는 사원번호 : " + emp.eno);
		System.gc();
	}
}

class Employee {
	//필드
	public int eno;

	//생성자
	public Employee (int eno) {
		this.eno = eno;
		System.out.println("Employee" + eno + " 생성");
	}

	//소멸자
	public void finalize() {
		System.out.println("Employee" + eno + " 제거");
	}
}