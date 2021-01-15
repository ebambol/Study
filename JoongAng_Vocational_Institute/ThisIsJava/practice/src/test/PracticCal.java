
package test;
import java.util.Scanner;

public class PracticCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] op = {"+","-","*","/"};
		System.out.println("연산자 입력  (예시: +, -, * , /)");
		String oper = sc.next();
		System.out.println("첫번째 숫자 입력");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력");
		int num2 = sc.nextInt();
		
		int result = 0;
		
		switch (oper) {
		case "+" : 
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		default :
			System.out.println("연산자를 확인하세요");
			break;
		}
		for (int i = 0; i<op.length; i++)
			if(op[i].equals(oper)) {
		System.out.println(num1 + oper + num2 + " = " + result);
			}
		}
}
