package Practice;
import java.util.*;
//무승부결과 나올 시 재입력
//승리,패배 결과 나올 시 종료.

public class RSPProject {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user = "";
		int com = 0;
		String Ccom = "";

		do {
			System.out.print("user Data >");
			user = scan.nextLine();

			if(!( (user.equals("가위")) 
					|| (user.equals("바위")) 
					|| (user.equals("보"))) ) {
				System.out.println("옳바른 값을 입력하세요. ");
				continue;
			}

			com = (int)(Math.random()*3)+1;

			System.out.print("com  Data >");
			if(com==1) {
				Ccom = "가위";
				System.out.println(Ccom);
			}else if(com==2) {
				Ccom = "바위";
				System.out.println(Ccom);
			}else if(com==3) {
				Ccom = "보";
				System.out.println(Ccom);
			}

			if(user.equals(Ccom)) {
				System.out.println("무승부입니다.");
				System.out.println();
				continue;
			}else if(((user.equals("가위"))&&(Ccom.equals("보"))) || (user.equals("바위"))&&(Ccom.equals("가위")) || (user.equals("보"))&&(Ccom.equals("바위"))) {
				System.out.println("user의 승리입니다.");
				break;
			}else if(((user.equals("가위"))&&(Ccom.equals("바위"))) || (user.equals("바위"))&&(Ccom.equals("보")) || (user.equals("보"))&&(Ccom.equals("가위"))) {
				System.out.println("com 의 승리입니다.");
				break;
			}
		} while(true);
	}
}