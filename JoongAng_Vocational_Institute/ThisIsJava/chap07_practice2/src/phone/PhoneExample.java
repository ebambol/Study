package phone;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone();	//Cannot instantiate the type Phone
		SmartPhone sp = new SmartPhone("ȫ�浿");

		System.out.println(sp.owner);
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
	}

}
