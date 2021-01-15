/*
[2장 2번]


Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.

2자리 정수 입력(10~99)>>77
YES! 10의 자리와 1의 자리가 같습니다.
*/
package Prac;
import java.util.Scanner;

public class java2_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num,a,b; //a 10의자리 , b 1의자리

    System.out.print("2자리수 정수 입력(10~99)>>");
    num = sc.nextInt();
    a = num/10;
    b = num%10;
    
    if(a==b)
    System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
    else
    System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
    sc.close();
    }    
}