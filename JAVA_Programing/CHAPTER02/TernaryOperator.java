import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("빼고싶은 정수를 입력하세요.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(a+b)));
        scanner.close();
    }
}