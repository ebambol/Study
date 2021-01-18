package sec08.exam01_method_declaration;

public class CacuratorExample {

	public static void main(String[] args) {
		Calcurator myCalc = new Calcurator();
		myCalc.powerOn();
		int result1 = myCalc.plus(10, 20);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
	}
}
