package com.java.test4;

public class ExitExample {
	public static void main(String[] args) {
		System.out.println("5 �϶� ����� \n");
		//���Ȱ����� ����
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				//���ܹ߻��� ������ ���α׷� �����
				//���ܰ� �߻��Ǹ� ���α׷� ������� ����
				//(���ܹ߻��ÿ� ����ó�� �ڵ带 ����)
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});	//�͸�ü
		
		for (int i=0; i<10; i++) {
			//i�� ���
			System.out.print(i);
			try {
				//JVM �����û
				System.exit(i);
			} catch(SecurityException e) { }	
			System.out.println(" Exception �߻�");
//			} catch(Exception e) {	}	//Exception�� ���� (�ֻ��� Exception�̶�)
		}
	}
}
