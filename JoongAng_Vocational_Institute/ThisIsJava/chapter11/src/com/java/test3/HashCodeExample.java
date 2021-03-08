package com.java.test3;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		
		System.out.println(s1.hashCode());			//54151054
		System.out.println(Objects.hashCode(s2));	//54151054
	}
	
	static class Student {
		//�ʵ�
		int iSno;	//int -> Integer
		String strName;
		
		//������
		Student (int iSno, String strName){
			this.iSno = iSno;
			this.strName = strName;
		}
		
		//�޼ҵ�
		@Override
		public int hashCode() {
			return Objects.hash(iSno, strName);
		}
	}

}
