package baekJoon.whileLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10952 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		while((input = br.readLine()) != null) {
			
			int A = input.charAt(0)-48;
			int B = input.charAt(2)-48;
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
	}
}
