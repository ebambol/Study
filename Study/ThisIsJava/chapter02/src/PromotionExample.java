//2020-12-15 �̰��� �ڹٴ� p51 ������
public class PromotionExample {
	public static void main (String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	//int(4) <- byte(1)
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;	//int(4) <- char(2)
		System.out.println("���� �����ڵ�= " + intValue);
		
		intValue = 500;
		long longValue = intValue;	//long(8) <- int(4)
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//double(8) <- int(4)
		System.out.println(doubleValue);
	}
}
