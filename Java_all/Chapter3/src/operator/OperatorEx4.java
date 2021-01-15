package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2); //AND num1 * num2	0
		System.out.println(num1 | num2); //OR  num1 + num2	15
		System.out.println(num1 ^ num2); //XOR num1 num2�� ���� �ٸ��� 1	15
		
		System.out.println(num2 << 1); // 5*(2^1) ������ 10 ������ 0B00001010
		System.out.println(num2 << 2); // 5*(2^2) ������ 20 ������ 0B00010100
		System.out.println(num2 << 3); // 5*(2^3) ������ 40 ������ 0B00101000
		
		System.out.println(num2 >> 1); // 5/(2^1) ������ 2  ������ 0B00000010
		System.out.println(num2 >> 2); // 5/(2^2) ������ 1  ������ 0B00000001
		
		System.out.println(num2);	//shift �� ���� �ȵ� 5
		System.out.println(num2 <<= 3);	//shift�� ���� ���� 40
		System.out.println(num2);	//����� num2 ��� 40
	}

}
