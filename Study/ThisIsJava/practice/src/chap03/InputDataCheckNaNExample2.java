package chap03;

public class InputDataCheckNaNExample2 {
	public static void main (String[] agrs) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput);	//String -> Double
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN값이 입력되어 처리할 수 없음");
			val = 0.0;	// 0.0으로 초기화
		}
		
		currentBalance += val;	//10000.0 + 0.0
		System.out.println(currentBalance);
	}
}
