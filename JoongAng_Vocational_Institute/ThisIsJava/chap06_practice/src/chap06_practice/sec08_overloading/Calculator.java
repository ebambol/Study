package chap06_practice.sec08_overloading;

public class Calculator {
	//���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	}
	
	//���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
