package com.java.test1;
import java.util.Scanner;
public class RockPaerScissors {
/*입력 : 가위, 바위 ,보
 *컴퓨터와 가위바위보 를 한결과를 출력 
 *출력은 승리, 패배,무승부
 *Math.random() > 1:가위,  2:바위 ,  3:보
 *가위1<바위2<보3<가위1
 */
	public static void main(String[] args) {
		//--------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*3)+1;
		System.out.print("입력:");
		String b = sc.nextLine();
		int c = (b.equals("가위"))? 1: (b.equals("바위"))? 2:3;		
		String d = (a==c)? "무승부": (c-a)==(1)||(c-a)==(-2)? "승리": "패배"; 
		System.out.print("컴퓨터:"+a+"\t나:"+c+"\t결과:"+d);
		//--------------------------------------------------------------------
		
		/*번외 3명
		Scanner sc = new Scanner(System.in);
		String b1;
		int a = (int)(Math.random()*3)+1;
		int a1 = (int)(Math.random()*3)+1;
		System.out.print("입력:");
		String b = sc.nextLine();
		int a2 = (b.equals("가위"))? 1:(b.equals("바위"))? 2:3;
		if((a==a1)&&(a==a2)&&(a1==a2)) {
			b1 = "무승부";
		}else if((a!=a1)&&(a!=a2)&&(a1!=a2)) {
			b1 = "무승부";
		}else if((((a==a1)&&(a==3))&&(a2==1))) {
			b1 = "승리";
		}else if((((a!=a1)&&(a==3)||(a1==3))&&(a2==1))) {
			b1 = "승리";
		}else if(a<a2||a1<a2) {
			b1 = "승리";
		}else {
			b1 = "패배";
		}
		System.out.println("컴퓨터1 = " + a + "   컴퓨터2 = " +a1+ "   나 = "+a2);
		System.out.println(b1);
		*/
		
	}

}
