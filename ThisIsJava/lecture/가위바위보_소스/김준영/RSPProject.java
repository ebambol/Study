package Practice;
import java.util.*;
//���ºΰ�� ���� �� ���Է�
//�¸�,�й� ��� ���� �� ����.

public class RSPProject {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user = "";
		int com = 0;
		String Ccom = "";

		do {
			System.out.print("user Data >");
			user = scan.nextLine();

			if(!( (user.equals("����")) 
					|| (user.equals("����")) 
					|| (user.equals("��"))) ) {
				System.out.println("�ǹٸ� ���� �Է��ϼ���. ");
				continue;
			}

			com = (int)(Math.random()*3)+1;

			System.out.print("com  Data >");
			if(com==1) {
				Ccom = "����";
				System.out.println(Ccom);
			}else if(com==2) {
				Ccom = "����";
				System.out.println(Ccom);
			}else if(com==3) {
				Ccom = "��";
				System.out.println(Ccom);
			}

			if(user.equals(Ccom)) {
				System.out.println("���º��Դϴ�.");
				System.out.println();
				continue;
			}else if(((user.equals("����"))&&(Ccom.equals("��"))) || (user.equals("����"))&&(Ccom.equals("����")) || (user.equals("��"))&&(Ccom.equals("����"))) {
				System.out.println("user�� �¸��Դϴ�.");
				break;
			}else if(((user.equals("����"))&&(Ccom.equals("����"))) || (user.equals("����"))&&(Ccom.equals("��")) || (user.equals("��"))&&(Ccom.equals("����"))) {
				System.out.println("com �� �¸��Դϴ�.");
				break;
			}
		} while(true);
	}
}