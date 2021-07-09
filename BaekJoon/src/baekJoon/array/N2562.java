package baekJoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2562 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수선언
		int max = 0;
		int index = 0;

		for(int i=0; i<9; i++) {
			int value = Integer.parseInt(br.readLine());	//입력
			if(value>max) {	//비교
				max = value;	//대입
				index = i+1;	//위치 저장
			}
		}
		System.out.println(max+"\n"+index);	//출력
	}
}
