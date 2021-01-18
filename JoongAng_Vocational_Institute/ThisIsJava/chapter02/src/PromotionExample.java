//2020-12-15 이것이 자바다 p51 이현국
public class PromotionExample {
	public static void main (String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	//int(4) <- byte(1)
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;	//int(4) <- char(2)
		System.out.println("가의 유니코드= " + intValue);
		
		intValue = 500;
		long longValue = intValue;	//long(8) <- int(4)
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//double(8) <- int(4)
		System.out.println(doubleValue);
	}
}
