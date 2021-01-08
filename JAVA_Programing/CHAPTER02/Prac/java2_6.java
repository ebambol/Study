/*
[2장 6번]


369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라. 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.

1~99 사이의 정수를 입력하시오>>36
박수짝짝
*/package Prac;
import java.util.Scanner;

public class java2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , a=1 , b ; //a 10의 자리 , b 1의 자리
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        num = sc.nextInt();
        b = num%10;

        if(num>=10)
            a = num/10;
            if(num%10==0){
                b=-1;
            }
            System.out.print("박수");
            if(a%3==0) //num이 0이하인 경우 a%3=0이므로 a초기값은 1을 준다.
            System.out.print("짝");
            if(b%3==0)
            System.out.print("짝");

            sc.close();



    }
}