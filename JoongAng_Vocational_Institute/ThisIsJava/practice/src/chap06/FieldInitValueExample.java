package chap06;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : "+ fiv.longField);
		System.out.println("booleanField : " + fiv.booleanField);
		System.out.println(fiv.floatField);
		System.out.println(fiv.doubleField);
		System.out.println(fiv.arrField);
		System.out.println(fiv.referenceField);
	}

}
