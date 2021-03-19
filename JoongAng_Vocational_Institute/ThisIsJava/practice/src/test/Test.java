package test;

public class Test {
	private int sum;
	public int add(int a, int b) {
		sum = a+b;
		return sum;
	}
	public static void main(String[] args) {
		Test a = new Test();
		System.out.println(a.add(5, 7));
	}
}
