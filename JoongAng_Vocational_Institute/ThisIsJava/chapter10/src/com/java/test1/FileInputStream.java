package com.java.test1;

public class FileInputStream implements AutoCloseable{
	//필드
	private String file;
	
	//생성자
	public FileInputStream(String file) {
		this.file = file;
	}
	//메소드
	public void read() {
		System.out.println(file+"을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception {	//AutoCloseable의 추상메소드 close() 구현
		System.out.println(file+"을 닫습니다.");
	}
}
