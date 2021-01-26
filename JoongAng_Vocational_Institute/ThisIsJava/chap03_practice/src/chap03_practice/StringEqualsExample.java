package chap03_practice;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = "Ω≈πŒ√∂";
		String strVal2 = "Ω≈πŒ√∂";
		String strVal3 = new String("Ω≈πŒ√∂");
		
		System.out.println(strVal1 == strVal2);
		System.out.println(strVal1 == strVal3);
		System.out.println();
		System.out.println(strVal1.equals(strVal2));
		System.out.println(strVal1.equals(strVal3));
		
	}

}
