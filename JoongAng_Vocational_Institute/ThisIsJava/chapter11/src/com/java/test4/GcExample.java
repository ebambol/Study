package com.java.test4;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;

		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);

		System.out.println("emp�� ���������� �����ϴ� �����ȣ : " + emp.eno);
		System.gc();
	}
}

class Employee {
	//�ʵ�
	public int eno;

	//������
	public Employee (int eno) {
		this.eno = eno;
		System.out.println("Employee" + eno + " ����");
	}

	//�Ҹ���
	public void finalize() {
		System.out.println("Employee" + eno + " ����");
	}
}