package chap03;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;	//String + int => String + String
		String str2 = str1 + " Ư¡";	//String(str1) + String
		System.out.println(str1);	//JDK6.0
		System.out.println(str2);	//JDK6.0 Ư¡
		
		String str3 = "JDK" + 3 + 3.0;
		//String + int + double => String + String + String
		String str4 = 3 + 3.0 + "JDK";
		//(int + int) + String => int ������ String ��ȯ
		
		System.out.println(str3);	//JDK33.0
		System.out.println(str4);	//6.0JDK
		
	}
}
