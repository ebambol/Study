package chap03;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;	//Infinity
//		double z = x % y;	//NaN
		
		System.out.println(Double.isInfinite(z));	//Infinite �˻�
		System.out.println(Double.isNaN(z));	//NaN �˻�
		
		System.out.println(z + 2);	//Infinity
	}
}
