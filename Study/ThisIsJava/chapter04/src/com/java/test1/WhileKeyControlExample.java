//2020-12-30 이현국
package com.java.test1;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run){
			//keyCode가 값이 13이 아니면서 10도 아니면 true
			if(keyCode !=13 && keyCode != 10) {	//Enter 키 입력 체크
				System.out.println("--------------------------");
				System.out.println("1.증속 | 2.감속 | 3.정지");
				System.out.println("--------------------------");
				System.out.print("선택 : ");
			}
			
			keyCode = System.in.read();	//키보드 키값 읽음
			
			//if문
			if(keyCode==49) {	//1이냐?
				speed++;
				System.out.println("현재속도 : " + speed);
			}else if (keyCode==50) {	//2이냐?
				speed--;
				System.out.println("현재속도 : " + speed);
			}else if (keyCode==51) {	//3이냐?
				System.out.println("정지");
				run=false;	//while 조건식 변수
			}
			
			/*//switch문
			switch(keyCode) {
			case 49 :
				speed++;
				System.out.println("현재속도 : " + speed);
				break;
			case 50 :
				speed--;
				System.out.println("현재속도 : " + speed);
				break;
			case 51 :
				System.out.println("정지");
				run = false;
				break;
			}*/
		}
		System.out.println("프로그램 종료");
	}

}
