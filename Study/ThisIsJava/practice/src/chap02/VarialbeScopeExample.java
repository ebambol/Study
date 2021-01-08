package chap02;

public class VarialbeScopeExample {
	public static void main(String[] agrs) {
		int v1= 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
	}
}
