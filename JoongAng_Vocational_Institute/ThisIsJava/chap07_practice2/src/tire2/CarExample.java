package tire2;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		
		for(int i=0; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation!=0) {
				System.out.println(car.tires[problemLocation-1].location + "�ѱ�Ÿ�̾�� ��ü" );
				car.tires[problemLocation-1] = new Hankook(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("------------------");
		}
	}

}
