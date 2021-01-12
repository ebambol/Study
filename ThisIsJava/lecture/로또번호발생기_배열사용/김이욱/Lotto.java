package com.java.lotto;
public class Lotto {
	//1~45개의 숫자 중 6개의 숫자를 중복없이 발생시켜 출력
	//int 배열을 사용하여 작성 math.random()
public static void main(String[] args) {
	int[] num = new int[6];
	boolean check = true;
	/*for(int i = 0; i < num.length; i++) {  //초기값 확인
		System.out.println("num[" + i + "]=" + num[i]);
	}
	
	do {for(int i = 0; i < num.length; i++) { //로또값 생성 배열저장
		num[i] = (int)(Math.random() * 45) + 1;  
		System.out.println("num[" + i + "]=" + num[i]);
		}
		
	bp1:	for(int j = 0; j < num.length; j++) {
			for(int k = 0; k < num.length; k++) {  //인덱스 같은 위치의 자료 비교 건너뛰기
				if(j == k) {continue;} 
				System.out.print("j=" + j + ":(" + num[j]+"),");
				System.out.print("k=" + k + ":(" + num[k]+")");
				if(num[j] == num[k]) {
					System.out.println("같다");
					check = true;
					break bp1;
				}	else {
					System.out.println("다르다");
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
System.out.print("번호: ");

for(int i=0; i<6; i++) {
System.out.print(lotto[i] + " ");
		}
	
	}
}