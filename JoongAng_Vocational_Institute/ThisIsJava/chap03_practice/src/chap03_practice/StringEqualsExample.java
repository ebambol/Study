package chap03_practice;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = "�Ź�ö";
		String strVal2 = "�Ź�ö";
		String strVal3 = new String("�Ź�ö");
		
		System.out.println(strVal1 == strVal2);
		System.out.println(strVal1 == strVal3);
		System.out.println();
		System.out.println(strVal1.equals(strVal2));
		System.out.println(strVal1.equals(strVal3));
		
	}

}
