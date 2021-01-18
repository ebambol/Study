//2020-12-14 이것이 자바다 p56
package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;

//		float num3 = num2;
		double num3 = num2;
		num2 = (int) num3;

		int result = num1 - num2;
		System.out.println(result);
	}

}
//-4 (float)
//0 (double)