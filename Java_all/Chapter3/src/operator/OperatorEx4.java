package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2); //AND num1 * num2	0
		System.out.println(num1 | num2); //OR  num1 + num2	15
		System.out.println(num1 ^ num2); //XOR num1 num2가 서로 다르면 1	15
		
		System.out.println(num2 << 1); // 5*(2^1) 십진수 10 이진수 0B00001010
		System.out.println(num2 << 2); // 5*(2^2) 십진수 20 이진수 0B00010100
		System.out.println(num2 << 3); // 5*(2^3) 십진수 40 이진수 0B00101000
		
		System.out.println(num2 >> 1); // 5/(2^1) 십진수 2  이진수 0B00000010
		System.out.println(num2 >> 2); // 5/(2^2) 십진수 1  이진수 0B00000001
		
		System.out.println(num2);	//shift 값 저장 안됨 5
		System.out.println(num2 <<= 3);	//shift한 값을 대입 40
		System.out.println(num2);	//저장된 num2 출력 40
	}

}
