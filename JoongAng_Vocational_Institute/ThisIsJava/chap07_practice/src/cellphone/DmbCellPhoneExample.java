package cellphone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		
		dmbCellPhone.powerUp();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("하이");
		dmbCellPhone.receiveVoice("바이");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
	}

}
