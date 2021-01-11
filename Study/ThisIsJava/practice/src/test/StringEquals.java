package test;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "신민철";
		String str2 = "신민철";
		
		if(str1 == str2) {
			System.out.println("1, 2서로 같음");
		} else {
			System.out.println("1, 2서로 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("문자열 같음");
		}
		
		String str3 = new String("신민철");
		String str4 = new String("신민철");
		
		
		if(str3 == str4) {
			System.out.println("3, 4서로 같음");
		} else {
			System.out.println("3, 4서로 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println("문자열 같음");
		}
	}
}
