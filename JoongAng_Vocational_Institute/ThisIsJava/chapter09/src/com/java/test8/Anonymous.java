package com.java.test8;

public class Anonymous {
	//필드
	private int field;
	
	//생성자
	
	//메소드
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		/*final*/int var2 = 0;
		
		field = 10;
		
//		arg1 = 20;	//(x) //The final local variable arg1 cannot be assigned. It must be blank and not using a compound assignment
//		arg2 = 20;	//(x) 
		
//		var1 = 30;	//(x) 
//		var2 = 30;	//(x) 
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
