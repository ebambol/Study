package com.java.test1;
import java.util.Scanner;  //Scanner Ŭ������ ����ϱ� ���� �ʿ�
import java.util.Scanner;

public class RockPaperScissos2 {

	public static void main(String[] args) {
		/* �Է� ����,����,��
		 * ��ǻ�Ϳ� ������������ �� ����� ��� �¸�,�й�,���º�
		 * Math.random() => 1 ���� > 2 ���� > 3 ��
		 * ��,��,���º� �Է�
		 */
		int num = (int)(Math.random()*3) + 1;
		int a = 1; //com ����
		int b = 2; //com ����
		int c = 3; //com ��
	
		Scanner scanner = new Scanner(System.in);
		String user;
		System.out.print("user : ");
		user = scanner.nextLine();
		
		String com = "";
	
		if (num == 1) {
			com = "����"; 
			System.out.println("com : "+com);
		} else if (num == 2){
			com = "����";
			System.out.println("com : "+com);
			
		} else if (num == 3){
			com = "��";
			System.out.println("com : "+com);			
		} 
		
		
			
		
		 if ((user.equals("����") &&  (com.equals("��")))) {
					System.out.println("user �¸�");
					
			} else if ((user.equals("����") &&  (com.equals("����")))) {
					System.out.println("user �¸�");
					
			}else if ((user.equals("��") &&  (com.equals("����")))) {
					System.out.println("user �¸�");
					
			}else if ((user.equals("����") &&  (com.equals("����")))) {
					System.out.println("user �й�");
					
			}else if ((user.equals("����") &&  (com.equals("��")))) {
					System.out.println("user �й�");
					
			}else if ((user.equals("��") &&  (com.equals("����")))) {
					System.out.println("user �й�");
					
			} else if ((user.equals("����") ==  (com.equals("����"))))  {
					System.out.println("���º�");
					
			} else if ((user.equals("����") ==  (com.equals("����"))))  {
					System.out.println("���º�");
					
			} else if ((user.equals("��") ==  (com.equals("��"))))  {
					System.out.println("���º�");
					
				} 

			
		System.out.println("���α׷� ����");  
		

}
}