//2020-12-14 �̰����ڹٴ� p43 ������
public class CharExample {
	public static void main (String[] args) {
		char c1 = 'A'; //���ڸ� ���� ����
		char c2 = 65; //10������ ����
		char c3 = '\u0041'; //16������ ����
		
		char c4 = '��'; //���ڸ� ���� ����
		char c5 = 44032; //10������ ����
		char c6 = '\uac00'; //16������ ����
		
		int uniCode = c1; //�����ڵ� �ޱ� char -> int (promotion ���� ����ȯ)
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
	}
}
/*
 * �����ڵ�
 * char -> chr 
 * chr cannot be resolved to a type
 * 
 * char c1 = "A"
 * Type mismatch: cannot convert from String to char
 * 
 * char c3 = \u0041;
 * A cannot be resolved to a variable
 * 
 * char c4 = '����' / char c3 = '\0041'
 * Invalid character constant
 */
