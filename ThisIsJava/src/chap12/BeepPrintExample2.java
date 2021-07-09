package chap12;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//스레드 실행 내용
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();	//BeepTask 실행
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
