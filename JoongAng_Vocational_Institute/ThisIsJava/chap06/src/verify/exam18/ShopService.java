package verify.exam18;

public class ShopService {
	//�����ʵ�
	//�ڽ��� Ÿ���� ���� �ʵ带 �ϳ� ����, �ڽ��� ��ü�� ������ �ʱ�ȭ
	private static ShopService shopservice = new ShopService();
	
	//������
	//�ܺο��� ȣ���� �� ������
	private ShopService() {
	}
	
	//���� �޼ҵ�
	//�ܺο��� ȣ�� �� �� �ִ� ���� �޼ҵ� getInstance()����
	static ShopService getInstance(){
		//�����ʵ忡�� �����ϰ� �ִ� �ڽ��� ��ü�� ����
		return shopservice;
	}
	
	
}
