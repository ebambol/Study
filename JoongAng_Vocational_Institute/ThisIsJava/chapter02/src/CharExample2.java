//2020-12-14 �̰����ڹٴ� p43 ������
public class CharExample2 {
	public static void main (String[] args) {
		char c1 = 'A'; //���ڸ� ���� ����
		char c2 = 65; //10������ ����
		char c3 = '\u0041'; //16������ ����
		
		char c4 = '��'; //���ڸ� ���� ����
		char c5 = 44032; //10������ ����
		char c6 = '\uac00'; //16������ ����
		
		int uniCode = c4; //�����ڵ� �ޱ� char -> int (promotion ���� ����ȯ)

		System.out.print(c4); //44032
		System.out.println(uniCode);
		c4++; // 44033 =>  ��
		uniCode = c4;	//���� = ����
		System.out.print(c4);
		System.out.println(uniCode);
		c4++; // 44034 => �A
		uniCode = c4;	//���� = ����
		System.out.print(c4);
		System.out.println(uniCode);
		//�ѱ���ü���
		for(c4 = 44032; c4 <=55203; c4++)
			System.out.print(c4);
	}
}
/*
 * �����ڵ�
 * char -> chr 
 * chr cannot be resolved to a type
 * char c3 = \u0041;
 * A cannot be resolved to a variable
 * char c4 = '����' / char c3 = '\0041'
 * Invalid character constant
 */
