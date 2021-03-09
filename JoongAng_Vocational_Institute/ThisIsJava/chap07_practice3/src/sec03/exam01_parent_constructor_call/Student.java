package sec03.exam01_parent_constructor_call;

public class Student extends People {
	public int StudentsNo;
	
	public Student(String name, String ssn,int StudentNo) {
		super(name, ssn);
		this.StudentsNo = StudentNo;
		System.out.println("자식 객체 생성 완료");
	}
}
