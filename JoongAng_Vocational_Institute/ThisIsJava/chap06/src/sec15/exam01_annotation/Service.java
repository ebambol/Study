package sec15.exam01_annotation;

public class Service {
	//PrintAnnotation�� value="-"�� number=15 ��ŭ ���
	@PrintAnnotation
	public void method1() {
		System.out.println("���� ����1");
	}
	
	//value�� *�� ��ġ�� 15��ŭ ���, �⺻������Ʈ�� ��������
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���� ����2");
	}
	
	//value�� #���� ��ġ�� 20��ŭ ���, ������Ʈ ���� ���ÿ� �ֱ� ������ �������ι������ ����
	@PrintAnnotation(value="#",number=20)
	public void method3() {
		System.out.println("���� ����3");
	}
}
