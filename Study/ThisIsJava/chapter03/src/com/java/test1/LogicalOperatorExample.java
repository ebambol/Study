package com.java.test1;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// A~Z 유니코드 65~90
		// a~z 유니코드 97~122
		// 0~9 유니코드 48~57


		int charCode = 'A';
		System.out.println("charCode :" + (char)charCode);
		
		if((charCode>=65) & (charCode<=90) ) {	//charCode 65 ~ 90 범위의 값이냐?
			System.out.println("대문자 이군요");
		}
		if((charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자 이군요");
		}
		if((charCode>=48) && (charCode<=57) ) {
			// 코드가 48보다 크거나 같으면서, 57보다 작다
			// 코드가 48이상이면서 57이하면 숫자다.
			System.out.println("0~9 숫자 이군요");
		}
		if(!(charCode<48) && !(charCode>57) ) {
			// 코드가 48보다 작지 않고 57보다 작다 
			// 48 미만이 아니고, 57초과하지 않는다 => 48을 초과하면서 57미만이다 => 48을 초과 57미만의 수
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요.");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요.");
		}
		if((value%2==0) && (value%3==0)) {
			System.out.println("2와 3의 배수 이군요.");
		}
		//짝수 홀수
//		if(value%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
	}
}
