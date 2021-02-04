package computer;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Computer");
		return Math.PI * r* r;
	}
}
