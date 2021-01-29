package com.java.test9;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//serviceŬ�����κ��� �޼ҵ� ������ ����
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		//Method ��ü�� �ϳ��� ó��
		for(Method method : declaredMethods) {
			//PrintAnnotation�� ���� �Ǿ����� Ȯ��
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//System.out.println("PrintAnnotation ����: "+method.isAnnotationPresent(PrintAnnotation.class));
				//PrintAnnotation ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				//�޼ҵ� �̸� ���
				System.out.println("["+method.getName() + "]");
				//���м� ���
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					//Service��ü�� �޼ҵ� ȣ��
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}	//End of if
		}	//End of for
	}	//End of main
}	
