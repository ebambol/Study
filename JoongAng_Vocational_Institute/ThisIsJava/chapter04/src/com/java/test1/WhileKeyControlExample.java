//2020-12-30 ������
package com.java.test1;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run){
			//keyCode�� ���� 13�� �ƴϸ鼭 10�� �ƴϸ� true
			if(keyCode !=13 && keyCode != 10) {	//Enter Ű �Է� üũ
				System.out.println("--------------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("--------------------------");
				System.out.print("���� : ");
			}
			
			keyCode = System.in.read();	//Ű���� Ű�� ����
			
			//if��
			if(keyCode==49) {	//1�̳�?
				speed++;
				System.out.println("����ӵ� : " + speed);
			}else if (keyCode==50) {	//2�̳�?
				speed--;
				System.out.println("����ӵ� : " + speed);
			}else if (keyCode==51) {	//3�̳�?
				System.out.println("����");
				run=false;	//while ���ǽ� ����
			}
			
			/*//switch��
			switch(keyCode) {
			case 49 :
				speed++;
				System.out.println("����ӵ� : " + speed);
				break;
			case 50 :
				speed--;
				System.out.println("����ӵ� : " + speed);
				break;
			case 51 :
				System.out.println("����");
				run = false;
				break;
			}*/
		}
		System.out.println("���α׷� ����");
	}

}
