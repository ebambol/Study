package chap06_practice.sec08_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		//���簢���� ����
		double result1 = myCalc.areaRectangle(10);
		
		//���簢���� ����
		double result2 = myCalc.areaRectangle(10, 20);
		
		//��� ���
		System.out.println("���簢���� ���� : " + result1);
		System.out.println("���簢���� ���� : " + result2);
	}

}
