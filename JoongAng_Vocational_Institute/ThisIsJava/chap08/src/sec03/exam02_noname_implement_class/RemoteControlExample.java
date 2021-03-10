package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public int volume;

			@Override
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
			}

			@Override
			public void setVolume(int volume) {
				if(volume<RemoteControl.MAX_VALUME) {
					this.volume = RemoteControl.MAX_VALUME;
				} else if(volume>RemoteControl.MIN_VALUME) {
					this.volume = RemoteControl.MIN_VALUME;
				} else {
					this.volume = volume;
				}
				System.out.println("���� TV ���� : " + this.volume);
			}
			
		};
	}

}
