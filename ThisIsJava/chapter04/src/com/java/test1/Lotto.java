//2020-12-30 ������
package com.java.test1;

public class Lotto {

	public static void main(String[] args) {
		int lnum1 = 0;	// �ζ� ��÷��ȣ ���� (lnum1~6) + ���ʽ� (bonus)
		int lnum2 = 0;
		int lnum3 = 0;
		int lnum4 = 0;
		int lnum5 = 0;
		int lnum6 = 0;
		int bonus = 0;
		int i = 0;	//ī���ͺ���
		
//		for(i=0; i<7;) {	//for�� (���� while 18���� �ּ�)
//		do {				//do-while (���� 45���� �ּ� Ǯ�� 	//for,while 16����  18���� �ּ� )
		while (i<7) {	//0~6���� 7�� ���� ������ �����
			int num = (int)(Math.random()*45)+1;	//��ȣ����
			//�ߺ�Ȯ��			//switch���� ��ȣ���� ����Ÿ��,String�� ������ ���� ������
			if(lnum1 != num && lnum2 != num &&lnum3 != num &&lnum4 != num &&lnum5 != num &&lnum6 != num && bonus != num) {
				//�ʱⰪ(0)�� ������ num������ �ʱ�ȭ
				if(lnum1 == 0) {
					lnum1 = num;
				}else if (lnum2 == 0) {
					lnum2 = num;
				}else if (lnum3 == 0) {
					lnum3 = num;
				}else if (lnum4 == 0) {
					lnum4 = num;
				}else if (lnum5 == 0) {
					lnum5 = num;
				}else if (lnum6 == 0) {
					lnum6 = num;
				}else {
					bonus = num;
				}
			}
			//0�� �������� ī���� ���� -1 (lnum1�� ������ 0�� ���� ���� ����)	//���๮�� �����̶� ��({})�������������� ������������ , ���� ������� ����
			if(bonus == 0 || lnum6 == 0 || lnum5 ==0 || lnum4 ==0 || lnum3 ==0 || lnum2 ==0) {
				i--;
			}
			i++;	//ī���� ���� +1
		} 
//		while(i<7);		//do while�� while �κ�
		//���
		System.out.println("��÷��ȣ : " +lnum1+ " " +lnum2+ " " +lnum3+ " " +lnum4+ " " +lnum5+ " " +lnum6+ " + ���ʽ�: " +bonus);
	}
}
