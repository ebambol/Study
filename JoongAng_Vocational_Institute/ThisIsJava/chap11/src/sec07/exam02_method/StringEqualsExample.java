package sec07.exam02_method;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("�ſ��");
		String strVar2 = "�ſ��";
		String strVar3 = "�ſ��";
		
		if(strVar1 == strVar2) {
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
	}

}