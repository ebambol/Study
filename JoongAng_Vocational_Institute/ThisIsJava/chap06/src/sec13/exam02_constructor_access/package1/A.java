package sec13.exam02_constructor_access.package1;

public class A {
	//���� Ŭ���������� �� ��밡��
	A a1 = new A(true);	//public ����
	A a2 = new A();	//default ����
	A a3 = new A("���ڿ�");	//private ����
	
	public A(boolean b) {}	//public
	A() {}	//default
	private A(String s) {}	//private
}
