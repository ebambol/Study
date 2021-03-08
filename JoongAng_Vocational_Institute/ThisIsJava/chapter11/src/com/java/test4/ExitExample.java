package com.java.test4;

public class ExitExample {
	public static void main(String[] args) {
		System.out.println("5 일때 종료됨 \n");
		//보안관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				//예외발생이 없으면 프로그램 종료됨
				//예외가 발생되면 프로그램 종료되지 않음
				//(예외발생시에 예외처리 코드를 실행)
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});	//익명객체
		
		for (int i=0; i<10; i++) {
			//i값 출력
			System.out.print(i);
			try {
				//JVM 종료요청
				System.exit(i);
			} catch(SecurityException e) { }	
			System.out.println(" Exception 발생");
//			} catch(Exception e) {	}	//Exception도 가능 (최상위 Exception이라서)
		}
	}
}
