package verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("============================");
			System.out.print("선택>");
			
			int num = scanner.nextInt();

			if (num==1){
				System.out.print("예금액>");
				balance += scanner.nextInt();
			} else if (num==2) {
				System.out.print("출금액>");
				int out = scanner.nextInt();
				if(balance < out) {
					System.out.print("돈없어");
				}else {
					balance -= out;
				}
			} else if (num==3) {
				System.out.println("잔고>" + balance);
			} else if (num==4){
				System.out.println("\n프로그램 종료");
				run=false;
			} 
		}
	}

}
