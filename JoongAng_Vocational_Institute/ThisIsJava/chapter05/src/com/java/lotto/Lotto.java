package com.java.lotto;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * 45�� �ߺ� x , int �迭�� �ۼ�
		 */
		int[] arr = new int[6];	//�ε��� 0~5���� �迭 ����
		for(int i=0; i<6; i++) {
			arr[i] = (int)(Math.random()*45)+1;	//i=0~5 �̸� arr[i]�� ������ �ֱ�
			for(int j=0; j<i; j++) {	// j<i�϶� ��ø for��
				if(arr [i] == arr[j]) {	//	�ߺ�����
					i--;				//i 1���� for�� �ݺ�
					break;	//����������
				}
			}
		}
		System.out.print("��÷��ȣ : ");
		//���
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == arr[arr.length-1]) {	//arr[i]�� arr[5] �϶�
				System.out.print(arr[i]);	// arr[i] ���
			}else {
				System.out.print(arr[i]+", ");	//�ƴϸ� arr[i] + ,
			}
		}
	}
}
