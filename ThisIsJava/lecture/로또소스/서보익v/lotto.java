package com.java.test2;

public class lotto {

	public static void main(String[] args) {
		int a, b, c, d, e, f;
		do {
			a=(int)(Math.random()*45) + 1;
			b=(int)(Math.random()*45) + 1;
			c=(int)(Math.random()*45) + 1;
			d=(int)(Math.random()*45) + 1;
			e=(int)(Math.random()*45) + 1;
			f=(int)(Math.random()*45) + 1;
			
				
		
		}
		
		while(a == b || a == c || a == d || a == e || a == f ||
				b == c || b == d || b == e || b == f ||
				c == d || c == e || c == f ||
				d == e || d == f ||
				f == e);
		System.out.print("로또번호 : " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);
			
		}
		}


			
			
		
		
		
				
		
																							

