package com.java.test1;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println("�հ��� :" + result);
		} catch(ArithmeticException e ){
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
			System.out.println(e.getMessage());
		}
	}	//End Of main()
	
	public static int safeAdd (int left, int right) {
		if((right>0))
			System.out.println(Integer.MAX_VALUE);	//2147483647
			System.out.println(Integer.MAX_VALUE-right);
			//2147483647 - 2000000000 = 147483647
			if(left>(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("1. �����÷ο� �߻�");
			} else {	//right <=0
				if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("2. �����÷ο� �߻�");
				}
			}
		//�߰� ����
		return left + right;
	}
}	//End of class
