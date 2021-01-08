package com.java.test1;

public class IncreaseDecreaseOperatorExample2 {
	public static void main (String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------------");
		y--;
		--y;
		System.out.println("y= " + y);

		System.out.println("--------------------------");
//		후위 증가 연산자와 대입연산자를 같이 쓸경우
//		z = y--; 명령 문장은 아래와 같은 순서로 실행됨.
//		1번 z = y;
//		2번 y--;
		z = y--;
		System.out.println("z= " + z); //z=8
		System.out.println("x= " + y); //y=7


/*
		System.out.println("--------------------------");
//		전위 증가 연산자와 대입연산자를 같이 쓸경우
//		z = ++x; 명령 문장은 아래와 같은 순서로 실행됨.
//		1번 ++x;
//		2번 z = x;
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);

//		x=14, y=8, z= 12
		System.out.println("--------------------------");
		z = ++x + y++; //x=15, 15+8=>23(z), y=9
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
*/
	}
}
