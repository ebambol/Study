package com.java.test1;

public class TryWithResourceExample {

	public static void main(String[] args) {
		/*
		 * ���ҽ� ��ü(FileInputStream) �� ����ϴ� �߿� ���ܰ� �߻� �� ���
		 * ����, ���ҽ� ��ü�� ����ϰ� �ִ� �ڿ��� �ݳ�(close() �ڵ�����)�� ��
		 * ���ܿ� �ش��ϴ� catch ����� �����Ѵ�.
		 */
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();	//������ ���� �߻�
		} catch(Exception e) {
			System.out.println("���� ó�� �ڵ尡 ���� �Ǿ����ϴ�.");
		}
	}

}
