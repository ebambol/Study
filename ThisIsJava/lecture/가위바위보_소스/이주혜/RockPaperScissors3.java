import java.util.Scanner;
public class RockPaperScissors3 {
	public static void main(String[] args) {
		/*
		 * ���������� ����
		 * �Է� : "����", "����", "��"
		 * ��ǻ�Ϳ� ������������ �� ����� ��� "�¸�", "���º�", "�й�"
		 * Math.random() => 1=> ����, 2=> ����, 3=> ��
		 * ���� < ���� < �� < ���� ... 
		 */
		System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
		System.out.println("user : ");	
		Scanner scanner = new Scanner(System.in);
		String rpsUser;
		rpsUser = scanner.nextLine();
		
		do {
			int com = (int)(Math.random()*3)+1;
			// ���� = 1, ���� = 2, �� = 3

			if(com == 1){System.out.println("com : ����");} 
			else if (com == 2) {System.out.println("com : ����");} 
			else {System.out.println("com : ��");}

		switch(rpsUser) {
		case "����":
			if(com == 1) {System.out.println("Result : ���º�");} 
			else if(com == 2) {System.out.println("Result : �й�");}
			else {System.out.println("Result : �¸�");}
			break;
			
		case "����":
			if(com == 1) {System.out.println("Result : �¸�");} 
			else if(com == 2) {System.out.println("Result : ���º�");}
			else {System.out.println("Result : �й�");}
			break;
			
		case "��":
			if(com == 1) {System.out.println("Result : �й�");} 
			else if(com == 2) {System.out.println("Result : �¸�");}
			else {System.out.println("Result : ���º�");}
			break;
			} 		
		System.out.println("�� �� ��?!(��ġ�����ø� q�� �Է����ּ���)");
		System.out.println("user : ");	
		rpsUser = scanner.nextLine(); 
		} while(!rpsUser.equals("q"));
	}
}