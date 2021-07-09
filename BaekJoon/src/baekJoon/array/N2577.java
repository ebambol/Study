package baekJoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2577 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		int result =1;
		for(int i=0; i<3;i ++) {
			arr[i] = Integer.parseInt(br.readLine());
			result *=arr[i];
		}

		String str = String.valueOf(result);
		int[] arrResult = new int[10];
		for(int i=0; i<str.length(); i++) {
			arrResult[str.charAt(i)-48]++;
		}
		for(int v : arrResult) {
			System.out.println(v);
		}

	}
}
