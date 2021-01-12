package com.java.test1;
import java.util.Scanner;  //Scanner 클래스를 사용하기 위해 필요
import java.util.Scanner;

public class RockPaperScissos2 {

	public static void main(String[] args) {
		/* 입력 가위,바위,보
		 * 컴퓨터와 가위바위보를 한 결과를 출력 승리,패배,무승부
		 * Math.random() => 1 가위 > 2 바위 > 3 보
		 * 승,패,무승부 입력
		 */
		int num = (int)(Math.random()*3) + 1;
		int a = 1; //com 가위
		int b = 2; //com 바위
		int c = 3; //com 보
	
		Scanner scanner = new Scanner(System.in);
		String user;
		System.out.print("user : ");
		user = scanner.nextLine();
		
		String com = "";
	
		if (num == 1) {
			com = "가위"; 
			System.out.println("com : "+com);
		} else if (num == 2){
			com = "바위";
			System.out.println("com : "+com);
			
		} else if (num == 3){
			com = "보";
			System.out.println("com : "+com);			
		} 
		
		
			
		
		 if ((user.equals("가위") &&  (com.equals("보")))) {
					System.out.println("user 승리");
					
			} else if ((user.equals("바위") &&  (com.equals("가위")))) {
					System.out.println("user 승리");
					
			}else if ((user.equals("보") &&  (com.equals("바위")))) {
					System.out.println("user 승리");
					
			}else if ((user.equals("가위") &&  (com.equals("바위")))) {
					System.out.println("user 패배");
					
			}else if ((user.equals("바위") &&  (com.equals("보")))) {
					System.out.println("user 패배");
					
			}else if ((user.equals("보") &&  (com.equals("가위")))) {
					System.out.println("user 패배");
					
			} else if ((user.equals("가위") ==  (com.equals("가위"))))  {
					System.out.println("무승부");
					
			} else if ((user.equals("바위") ==  (com.equals("바위"))))  {
					System.out.println("무승부");
					
			} else if ((user.equals("보") ==  (com.equals("보"))))  {
					System.out.println("무승부");
					
				} 

			
		System.out.println("프로그램 종료");  
		

}
}