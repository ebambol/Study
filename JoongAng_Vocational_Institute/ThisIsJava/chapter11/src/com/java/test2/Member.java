package com.java.test2;

/*
 * implements Cloneable ������
 * Exception in thread "main" java.lang.NullPointerException
 */
public class Member  implements Cloneable{	
	//A��ü�� �̿��ؼ� A��ü ����
	//�ʵ�
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	//������
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	//�޼ҵ�
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	//Object��ü�� clone(����)�� Member�� ĳ������ ����
		} catch(CloneNotSupportedException e) {/*���� ���೻�� ����*/ }
		return cloned;
	}
}
