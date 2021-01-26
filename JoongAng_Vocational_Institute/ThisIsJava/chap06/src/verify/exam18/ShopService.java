package verify.exam18;

public class ShopService {
	//정적필드
	//자신의 타입인 정적 필드를 하나 선언, 자신의 객체를 생성해 초기화
	private static ShopService shopservice = new ShopService();
	
	//생성자
	//외부에서 호출할 수 없도록
	private ShopService() {
	}
	
	//정적 메소드
	//외부에서 호출 할 수 있는 정적 메소드 getInstance()선언
	static ShopService getInstance(){
		//정적필드에서 참조하고 있는 자신의 객체를 리턴
		return shopservice;
	}
	
	
}
