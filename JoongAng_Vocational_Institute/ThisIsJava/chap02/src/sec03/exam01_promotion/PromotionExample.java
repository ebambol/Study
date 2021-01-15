//2020-12-14 이것이 자바다 p51
package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);

		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);

		longValue = 10000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);

	}

}
/*
10
44032
500
200.0
1.0E10
 */