
package test;
import java.util.Scanner;

public class PracticCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] op = {"+","-","*","/"};
		System.out.println("������ �Է�  (����: +, -, * , /)");
		String oper = sc.next();
		System.out.println("ù��° ���� �Է�");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է�");
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
			System.out.println("�����ڸ� Ȯ���ϼ���");
			break;
		}
		for (int i = 0; i<op.length; i++)
			if(op[i].equals(oper)) {
		System.out.println(num1 + oper + num2 + " = " + result);
			}
		}
}
