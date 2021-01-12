import java.util.Scanner;
public class RockPaperScissors3 {
	public static void main(String[] args) {
		/*
		 * 가위바위보 게임
		 * 입력 : "가위", "바위", "보"
		 * 컴퓨터와 가위바위보를 한 결과를 출력 "승리", "무승부", "패배"
		 * Math.random() => 1=> 가위, 2=> 바위, 3=> 보
		 * 가위 < 바위 < 보 < 가위 ... 
		 */
		System.out.println("가위, 바위, 보 中 하나를 입력하세요.");
		System.out.println("user : ");	
		Scanner scanner = new Scanner(System.in);
		String rpsUser;
		rpsUser = scanner.nextLine();
		
		do {
			int com = (int)(Math.random()*3)+1;
			// 가위 = 1, 바위 = 2, 보 = 3

			if(com == 1){System.out.println("com : 가위");} 
			else if (com == 2) {System.out.println("com : 바위");} 
			else {System.out.println("com : 보");}

		switch(rpsUser) {
		case "가위":
			if(com == 1) {System.out.println("Result : 무승부");} 
			else if(com == 2) {System.out.println("Result : 패배");}
			else {System.out.println("Result : 승리");}
			break;
			
		case "바위":
			if(com == 1) {System.out.println("Result : 승리");} 
			else if(com == 2) {System.out.println("Result : 무승부");}
			else {System.out.println("Result : 패배");}
			break;
			
		case "보":
			if(com == 1) {System.out.println("Result : 패배");} 
			else if(com == 2) {System.out.println("Result : 승리");}
			else {System.out.println("Result : 무승부");}
			break;
			} 		
		System.out.println("한 판 더?!(원치않으시면 q를 입력해주세요)");
		System.out.println("user : ");	
		rpsUser = scanner.nextLine(); 
		} while(!rpsUser.equals("q"));
	}
}