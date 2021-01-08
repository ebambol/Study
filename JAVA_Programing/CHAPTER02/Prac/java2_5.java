/*
[2장 5번]


Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 삼각형이 되려면 두변의 합이 다른 한 변의 합보다 커야 한다.

정수 3개를 입력하시오>>4 3 5
삼각형이 됩니다.
*/
package Prac;
import java.util.Scanner;

public class java2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("정수 3개를 입력하시오>>");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a+b<c) || (a+c<b) || (b+c<a)){
            System.out.println("삼각형이 안됩니다.");
        }
        else{
            System.out.println("삼각형이 됩니다.");
        }
        sc.close();
    }
    
}