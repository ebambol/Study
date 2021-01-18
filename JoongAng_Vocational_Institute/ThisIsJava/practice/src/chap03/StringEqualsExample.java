package chap03;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String ("신민철");
		
//		번지(주소)비교
		System.out.println( strVar1 == strVar2);	//true
		System.out.println( strVar1 == strVar3);	//false	
//		3는 새로운 객체를 만들어서 주소가 다름
		System.out.println();
//		문자열비교
		System.out.println( strVar1.equals(strVar2));	//true
		System.out.println( strVar1.equals(strVar3));	//true
		
	}
}
