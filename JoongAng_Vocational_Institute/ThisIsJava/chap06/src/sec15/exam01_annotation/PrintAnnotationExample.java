package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//�޼ҵ� ������ Method�迭�� ����
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		//declaredMethods�迭�� �޼ҵ� �ϳ��� �����ͼ� method�� ����
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//getAnnotation -> �� �޼ҵ忡 ����� ������̼��� ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//�޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "]");
				
				//���м� ���
				for(int i=0;i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//�޼ҵ� ȣ��
				try {
					method.invoke(new Service());
					/* �� �ڵ�� �̿� ����
				Service service = new Service();
				service.method1();
					 */
				} catch (Exception e) {
				} 
				System.out.println();
				
				
				
//				//�޼ҵ� �̸� ���
//				System.out.println(method.getName() + ": ");
//				//value�� ���� (������Ʈ �� ����)
//				System.out.println("value=" + printAnnotation.value());
//				//number ������Ʈ ����
//				System.out.println("number=" + printAnnotation.number());
//				System.out.println();
			}
			
			
//			//isAnotationPresent -> booleanŸ��, ������̼��� �����Ǿ����� Ȯ��
//			if(method.isAnnotationPresent(PrintAnnotation.class)) {
//				System.out.println(method.getName() + "���� ���� �Ǿ� ����");
//			} else {
//				System.out.println(method.getName() + "���� ����Ǿ� ���� ����");
//			}
			
			//getName() �޼ҵ� �̸� ����
//			System.out.println(method.getName());	//�޼ҵ� �̸� ���, ������ �������� ���÷���
		}
	}

}
