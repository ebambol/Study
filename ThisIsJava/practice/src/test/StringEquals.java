package test;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "�Ź�ö";
		String str2 = "�Ź�ö";
		
		if(str1 == str2) {
			System.out.println("1, 2���� ����");
		} else {
			System.out.println("1, 2���� �ٸ�");
		}
		
		if(str1.equals(str2)) {
			System.out.println("���ڿ� ����");
		}
		
		String str3 = new String("�Ź�ö");
		String str4 = new String("�Ź�ö");
		
		
		if(str3 == str4) {
			System.out.println("3, 4���� ����");
		} else {
			System.out.println("3, 4���� �ٸ�");
		}
		
		if(str3.equals(str4)) {
			System.out.println("���ڿ� ����");
		}
	}
}
