package verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("============================");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("============================");
			System.out.print("����>");
			
			int num = scanner.nextInt();

			if (num==1){
				System.out.print("���ݾ�>");
				balance += scanner.nextInt();
			} else if (num==2) {
				System.out.print("��ݾ�>");
				int out = scanner.nextInt();
				if(balance < out) {
					System.out.print("������");
				}else {
					balance -= out;
				}
			} else if (num==3) {
				System.out.println("�ܰ�>" + balance);
			} else if (num==4){
				System.out.println("\n���α׷� ����");
				run=false;
			} 
		}
	}

}
