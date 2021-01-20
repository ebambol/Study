package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//메소드 정보를 Method배열로 리턴
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		//declaredMethods배열로 메소드 하나를 가져와서 method에 대입
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//getAnnotation -> 이 메소드에 적용된 어노테이션을 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				//구분선 출력
				for(int i=0;i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//메소드 호출
				try {
					method.invoke(new Service());
					/* 위 코드는 이와 같음
				Service service = new Service();
				service.method1();
					 */
				} catch (Exception e) {
				} 
				System.out.println();
				
				
				
//				//메소드 이름 출력
//				System.out.println(method.getName() + ": ");
//				//value값 조사 (엘리먼트 값 조사)
//				System.out.println("value=" + printAnnotation.value());
//				//number 엘리먼트 조사
//				System.out.println("number=" + printAnnotation.number());
//				System.out.println();
			}
			
			
//			//isAnotationPresent -> boolean타입, 어노테이션이 지정되었는지 확인
//			if(method.isAnnotationPresent(PrintAnnotation.class)) {
//				System.out.println(method.getName() + "에는 적용 되어 있음");
//			} else {
//				System.out.println(method.getName() + "에는 적용되어 있지 않음");
//			}
			
			//getName() 메소드 이름 리턴
//			System.out.println(method.getName());	//메소드 이름 출력, 정보를 가져오는 리플렉션
		}
	}

}
