package chap03;

public class InputDataCheckNaNExample2 {
	public static void main (String[] agrs) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput);	//String -> Double
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN���� �ԷµǾ� ó���� �� ����");
			val = 0.0;	// 0.0���� �ʱ�ȭ
		}
		
		currentBalance += val;	//10000.0 + 0.0
		System.out.println(currentBalance);
	}
}
