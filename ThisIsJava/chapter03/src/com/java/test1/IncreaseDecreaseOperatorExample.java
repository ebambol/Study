package com.java.test1;

public class IncreaseDecreaseOperatorExample {
	public static void main (String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------------");
		x++;
		++x;
		System.out.println("x= " + x);

		System.out.println("--------------------------");
		y--;
		--y;
		System.out.println("y= " + y);

		System.out.println("--------------------------");
//		���� ���� �����ڿ� ���Կ����ڸ� ���� �����
//		z = x++; ��� ������ �Ʒ��� ���� ������ �����.
//		1�� z = x;
//		2�� x++;
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);


		System.out.println("--------------------------");
//		���� ���� �����ڿ� ���Կ����ڸ� ���� �����
//		z = ++x; ��� ������ �Ʒ��� ���� ������ �����.
//		1�� ++x;
//		2�� z = x;
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);

//		x=14, y=8, z= 12
		System.out.println("--------------------------");
		z = ++x + y++; //x=15, 15+8=>23(z), y=9
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}
