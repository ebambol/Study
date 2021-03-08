package com.java.test3;

import java.util.Arrays;

public class Member implements Cloneable{
	//�ʵ�
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	//������
	public Member (String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	//�޼ҵ�
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Member cloned = (Member) super.clone();	//Object clone() ȣ��
		//scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		//���� ������ Member ��ü�� ����
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	//�����ǵ� Object clone()�޼ҵ� ȣ��
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
