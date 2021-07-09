package baekJoon.forLoop;

import java.io.*;
import java.util.StringTokenizer;

public class N11022 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
		StringTokenizer st;
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i+": "+A+" + "+B+" = ");
			bw.write(A+B+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
