package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println(obj.intValue());
		
		//���Խ� �ڵ� ��ڽ�
		int value = obj;
		System.out.println(value);
		
		//����� �ڵ� ��ڽ�
		int result = obj+100;
		System.out.println(result);
	}

}
