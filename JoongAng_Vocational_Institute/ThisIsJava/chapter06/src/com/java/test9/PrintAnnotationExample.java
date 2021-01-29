package com.java.test9;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//service클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		//Method 객체를 하나씩 처리
		for(Method method : declaredMethods) {
			//PrintAnnotation이 적용 되었는지 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//System.out.println("PrintAnnotation 적용: "+method.isAnnotationPresent(PrintAnnotation.class));
				//PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				//메소드 이름 출력
				System.out.println("["+method.getName() + "]");
				//구분선 출력
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					//Service객체의 메소드 호출
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}	//End of if
		}	//End of for
	}	//End of main
}	
