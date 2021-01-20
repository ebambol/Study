package sec15.exam01_annotation;

public class Service {
	//PrintAnnotation의 value="-"을 number=15 만큼 출력
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	//value를 *로 고치고 15만큼 출력, 기본엘리먼트라 생략가능
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	//value를 #으로 고치고 20만큼 출력, 엘리먼트 값을 동시에 주기 때문에 정상적인방법으로 지정
	@PrintAnnotation(value="#",number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
