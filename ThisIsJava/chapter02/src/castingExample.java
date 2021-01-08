//2020-12-15 이것이 자바다 p54 이현국
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
