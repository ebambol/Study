package com.java.test1;
import java.util.Scanner;
public class RockPaerScissors {
/*�Է� : ����, ���� ,��
 *��ǻ�Ϳ� ���������� �� �Ѱ���� ��� 
 *����� �¸�, �й�,���º�
 *Math.random() > 1:����,  2:���� ,  3:��
 *����1<����2<��3<����1
 */
	public static void main(String[] args) {
		//--------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*3)+1;
		System.out.print("�Է�:");
		String b = sc.nextLine();
		int c = (b.equals("����"))? 1: (b.equals("����"))? 2:3;		
		String d = (a==c)? "���º�": (c-a)==(1)||(c-a)==(-2)? "�¸�": "�й�"; 
		System.out.print("��ǻ��:"+a+"\t��:"+c+"\t���:"+d);
		//--------------------------------------------------------------------
		
		/*���� 3��
		Scanner sc = new Scanner(System.in);
		String b1;
		int a = (int)(Math.random()*3)+1;
		int a1 = (int)(Math.random()*3)+1;
		System.out.print("�Է�:");
		String b = sc.nextLine();
		int a2 = (b.equals("����"))? 1:(b.equals("����"))? 2:3;
		if((a==a1)&&(a==a2)&&(a1==a2)) {
			b1 = "���º�";
		}else if((a!=a1)&&(a!=a2)&&(a1!=a2)) {
			b1 = "���º�";
		}else if((((a==a1)&&(a==3))&&(a2==1))) {
			b1 = "�¸�";
		}else if((((a!=a1)&&(a==3)||(a1==3))&&(a2==1))) {
			b1 = "�¸�";
		}else if(a<a2||a1<a2) {
			b1 = "�¸�";
		}else {
			b1 = "�й�";
		}
		System.out.println("��ǻ��1 = " + a + "   ��ǻ��2 = " +a1+ "   �� = "+a2);
		System.out.println(b1);
		*/
		
	}

}
