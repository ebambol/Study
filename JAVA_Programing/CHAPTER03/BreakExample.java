import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("exit입력시 종료합니다.");
        while(true){
            System.out.print(">>");
            String test = sc.next();
            if(test.equals("exit"))
            break;
        }
        System.out.println("종료합니다.");
        sc.close();
    }
}