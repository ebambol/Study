package chap03;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String ("�Ź�ö");
		
//		����(�ּ�)��
		System.out.println( strVar1 == strVar2);	//true
		System.out.println( strVar1 == strVar3);	//false	
//		3�� ���ο� ��ü�� ���� �ּҰ� �ٸ�
		System.out.println();
//		���ڿ���
		System.out.println( strVar1.equals(strVar2));	//true
		System.out.println( strVar1.equals(strVar3));	//true
		
	}
}
