package cellphone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		
		dmbCellPhone.powerUp();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("����");
		dmbCellPhone.receiveVoice("����");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
	}

}
