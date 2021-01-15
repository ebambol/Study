import java.util.Scanner;
public class CoffeePrice {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("무슨 커피를 드릴까요?");
		String order = scanner.next();  //주문 읽기
		int price = 0;
		switch(order){
		case "Espresso":
		case "Cappuccino":
		case "Latte":
			price = 3500;
			break;
		case "Americano":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다.");
		}
		if (price != 0)
			System.out.println(order+"는"+price+"원 입니다.");
		scanner.close();
	}

}

