package chap04_practice;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1;
		
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		}
		if(num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		}
		if(num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		}
		if(num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		}
		if(num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		}
		if(num==6) {
			System.out.println("6���� ���Խ��ϴ�.");
		}
	}

}
