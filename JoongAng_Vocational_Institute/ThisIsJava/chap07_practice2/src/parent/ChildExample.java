package parent;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method1();
		parent.method2();
//		parent.method3();	//The method method3() is undefined for the type Parent
		
		Child child = (Child)parent;
		child.method3();
	}

}
