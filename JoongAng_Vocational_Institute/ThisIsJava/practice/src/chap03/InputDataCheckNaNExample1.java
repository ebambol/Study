package chap03;

public class InputDataCheckNaNExample1 {
	public static void main (String[] agrs) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput);	//String -> Double
		
		double currentBalance = 10000.0;
		
		currentBalance += val;	//10000.0 + NaN
		System.out.println(currentBalance);	//NaN
	}
}
