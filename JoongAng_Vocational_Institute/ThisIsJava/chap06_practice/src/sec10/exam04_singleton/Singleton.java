package sec10.exam04_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();

	//持失切
	private Singleton() {
		
	}
	
	//五社球
	static Singleton getInstance() {
		return singleton;
	}
}
