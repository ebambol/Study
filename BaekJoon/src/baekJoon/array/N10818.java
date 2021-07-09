package baekJoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10818 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer.parseInt(br.readLine());	//입력 받기만함
		
		int low = 1000001;
		int hight = -1000001;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");	//공백을 기준으로 잘라서 보관

		while(st.hasMoreTokens()) {	//st값이 끝날때 까지
			int val = Integer.parseInt(st.nextToken());	//다음 토큰
			if(low>val) {
				low = val;
			}
			if(hight<val) {
				hight = val;
			}
		}
		System.out.println(low+" "+hight);	//출력
	}
}
