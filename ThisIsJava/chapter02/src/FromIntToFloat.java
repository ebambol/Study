//2020-12-15 �̰��� �ڹٴ� p55 ������
public class FromIntToFloat {
	public static void main (String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
//		System.out.println(num2);
		float num3 = num2;	//float <- int (promotion) �ڵ�����ȯ
//		System.out.println(num3);
		num2 = (int) num3;	//int <- float (casting) ��������ȯ
//		System.out.println(num2);
		int result = num1 - num2;
		System.out.println(result);
	}
}
