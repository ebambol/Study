package animal;

public class Dog extends Animal{
	//�ʵ�
	
	//������
	public Dog() {
		this.kind = "������";
	}
	//�޼ҵ�
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
