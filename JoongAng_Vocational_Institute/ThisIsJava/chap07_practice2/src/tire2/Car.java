package tire2;

public class Car {
	//�ʵ�
	Tire[] tires = {
		new Tire("�տ���", 6),
		new Tire("�տ�����", 4),
		new Tire("�ڿ���", 2),
		new Tire("�ڿ�����", 1)
	};
	
	//������
	
	//�޼ҵ�
	int run() {
		System.out.println("�޸��ϴ�.");
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {stop(); return(i+1); }
		}
		return 0;
	}
	public void stop() {
		System.out.println("����ϴ�.");
	}
}
