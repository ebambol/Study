//2020-12-15 �̰��� �ڹٴ� p54 ������
public class castingExample {
	public static void main (String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;	// char <- int
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;		// int <- long
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;	// int <- double
		System.out.println(intValue);
	}
}
