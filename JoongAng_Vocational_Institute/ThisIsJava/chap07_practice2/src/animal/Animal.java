package animal;

public abstract class Animal {
	//�ʵ�
	public String kind;
	
	//������
	
	//�޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	public abstract void sound();	//{}�ָ� ������
}
