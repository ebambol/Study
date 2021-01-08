/*
[2장 4번]


Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 평균값을 구하는 것이 아님에 주의하라.

정수 3개 입력>>20 100 33
중간 값은 33
*/
package Prac;
import java.util.Scanner;

public class java2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("정수 3개 입력하시오>>");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a<b && b<c) || (c<b && b<a)){
            System.out.print("중간 값은 " + b);
        }
        else if ((b<a && a<c) || (c<a)&&(a<b)){
            System.out.print("중간 값은 " + a);
        }
        else {
            System.out.print("중간 값은 " + c);
        }
        sc.close();
    }
}