package com.java.lotto;

public class lotto {
	public static void main(String[] args) {
		
		int a, b, c, d, e, f;
		boolean result = true;
		
		do {
			
		int [] lotto = new int [6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45  +1) ; 
		}
		 
		 a = lotto[0];
		 b = lotto[1];
		 c = lotto[2];
		 d = lotto[3];
		 e = lotto[4];
		 f = lotto[5];
		
		result =  (a==b) || (a==c) || (a==d) || (a==e) || (a==f)   ;
		
		result =  (b==c) || (b==d) || (b==e) || (b==f) || (b==a) || result ;  
	
		result =  (c==e) || (c==d) || (c==f) || (c==a) || (c==b) || result ; 
		
		result =  (d==f) || (d==e) || (d==a) || (d==b) || (d==c) || result ; 
	
		result =  (e==f) || (e==a) || (e==b) || (e==c) || (e==d) || result ; 
		
		result =  (f==e) || (f==a) || (f==b) || (f==c) || (f==d) || result ; 
	
		} while (result); 
		System.out.println(""+a+", "+b+", "+c+", "+d+", "+e+", "+f);
		
		
	}
}
