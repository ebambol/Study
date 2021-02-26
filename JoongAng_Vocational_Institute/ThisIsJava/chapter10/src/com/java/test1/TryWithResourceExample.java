package com.java.test1;

public class TryWithResourceExample {

	public static void main(String[] args) {
		/*
		 * 리소스 객체(FileInputStream) 를 사용하는 중에 예외가 발생 될 경우
		 * 먼저, 리소스 객체가 사용하고 있는 자원을 반납(close() 자동실행)한 후
		 * 예외에 해당하는 catch 블록을 실행한다.
		 */
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();	//강제로 예외 발생
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행 되었습니다.");
		}
	}

}
