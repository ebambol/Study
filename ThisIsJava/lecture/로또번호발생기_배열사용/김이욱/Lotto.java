package com.java.lotto;
public class Lotto {
	//1~45���� ���� �� 6���� ���ڸ� �ߺ����� �߻����� ���
	//int �迭�� ����Ͽ� �ۼ� math.random()
public static void main(String[] args) {
	int[] num = new int[6];
	boolean check = true;
	/*for(int i = 0; i < num.length; i++) {  //�ʱⰪ Ȯ��
		System.out.println("num[" + i + "]=" + num[i]);
	}
	
	do {for(int i = 0; i < num.length; i++) { //�ζǰ� ���� �迭����
		num[i] = (int)(Math.random() * 45) + 1;  
		System.out.println("num[" + i + "]=" + num[i]);
		}
		
	bp1:	for(int j = 0; j < num.length; j++) {
			for(int k = 0; k < num.length; k++) {  //�ε��� ���� ��ġ�� �ڷ� �� �ǳʶٱ�
				if(j == k) {continue;} 
				System.out.print("j=" + j + ":(" + num[j]+"),");
				System.out.print("k=" + k + ":(" + num[k]+")");
				if(num[j] == num[k]) {
					System.out.println("����");
					check = true;
					break bp1;
				}	else {
					System.out.println("�ٸ���");
					check = false;
				}
			}
		}
		
	} while(check);
	
	*/
	int lotto[] = new int [6];

	for(int i=0; i<6; i++) {
		lotto[i] = (int)(Math.random() * 45) + 1;

		for(int s=0; s<i; s++) {
			if(lotto[i] == lotto[s]) {
				i--;
				break;
			}
		}
	}
System.out.print("��ȣ: ");

for(int i=0; i<6; i++) {
System.out.print(lotto[i] + " ");
		}
	
	}
}