package chap06.computer;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] value1 = {1,2,3};
		int result1 = myCom.sum1(value1);
		System.out.println("result1 : " + result1);
		
		int[] result2 = myCom.sum1(new int[] {1,2,3,4,5});
		
	}

}
