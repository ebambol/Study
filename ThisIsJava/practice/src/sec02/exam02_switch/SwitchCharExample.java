package sec02.exam02_switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ��");
			break;

		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ��");
			break;
		default:
			System.out.println("�մ�");
		}
	}

}
