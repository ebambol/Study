import java.util.Scanner;
public class CheckTimeScanner {
    public static void main(String[] args) {
        System.out.println("더하기 프로그램 두 정수 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);
        scanner.close();
    }
}