package com.java.test1;
public class P114_Lotto {
//�ζǹ�ȣ �߻��⸦ �������� �� �ߺ����� ������ �ʵ��� ���α׷��� �����ϱ�!!!
	public static void main(String[] args) {
		int lnum1 , lnum2 , lnum3 , lnum4 , lnum5 , lnum6;
			lnum1 = (int)((Math.random()*45)+1);
			lnum2 = (int)((Math.random()*45)+1);
			lnum3 = (int)((Math.random()*45)+1);
			lnum4 = (int)((Math.random()*45)+1);
			lnum5 = (int)((Math.random()*45)+1);
			lnum6 = (int)((Math.random()*45)+1);
			for(int i = 0; (lnum2 == lnum1); i++) {
				lnum2 = (int)((Math.random()*45)+1);
			}
			for(int i = 0; (lnum3 == lnum1)||(lnum3 == lnum2); i++) {
				lnum3 = (int)((Math.random()*45)+1);
			}
			for(int i = 0; (lnum4 == lnum1)||(lnum4 == lnum2)||(lnum4 == lnum3); i++) {
				lnum4 = (int)((Math.random()*45)+1);
			}
			for(int i = 0; (lnum5 == lnum1)||(lnum5 == lnum2)||(lnum5 == lnum3)||(lnum5 == lnum4); i++) {
				lnum5 = (int)((Math.random()*45)+1);
			}
			for(int i = 0; (lnum6 == lnum1)||(lnum6 == lnum2)||(lnum6 == lnum3)||(lnum6 == lnum4)||(lnum6 == lnum5); i++) {
				lnum6 = (int)((Math.random()*45)+1);
			}
		System.out.print("��ȣ :" + lnum1 + "," + lnum2 + "," + lnum3 + "," + lnum4 + "," + lnum5 + "," + lnum6);
	}
}