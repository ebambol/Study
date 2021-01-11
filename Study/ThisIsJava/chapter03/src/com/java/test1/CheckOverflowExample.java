package com.java.test1;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println("합계결과 :" + result);
		} catch(ArithmeticException e ){
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
			System.out.println(e.getMessage());
		}
	}	//End Of main()
	
	public static int safeAdd (int left, int right) {
		if((right>0))
			System.out.println(Integer.MAX_VALUE);	//2147483647
			System.out.println(Integer.MAX_VALUE-right);
			//2147483647 - 2000000000 = 147483647
			if(left>(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("1. 오버플로우 발생");
			} else {	//right <=0
				if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("2. 오버플로우 발생");
				}
			}
		//중간 생략
		return left + right;
	}
}	//End of class
