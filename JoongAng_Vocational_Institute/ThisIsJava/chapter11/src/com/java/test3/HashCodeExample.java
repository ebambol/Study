package com.java.test3;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		System.out.println(s1.hashCode());			//54151054
		System.out.println(Objects.hashCode(s2));	//54151054
	}
	
	static class Student {
		//필드
		int iSno;	//int -> Integer
		String strName;
		
		//생성자
		Student (int iSno, String strName){
			this.iSno = iSno;
			this.strName = strName;
		}
		
		//메소드
		@Override
		public int hashCode() {
			return Objects.hash(iSno, strName);
		}
	}

}
