package cellphone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 15);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("ㅎㅇ");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();
	}

}
