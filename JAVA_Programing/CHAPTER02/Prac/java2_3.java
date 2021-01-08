/*
[2장 3번]


Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.

금액을 입력하시오>>65376
오만원권 1매
만원권 1매
천원권 5매
백원 3매
오십원 1매
십원 2매
일원 6매
*/
package Prac;
import java.util.Scanner;

public class java2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money, won_50000, won_10000, won_1000, won_100, won_50, won_10, won_1;

        System.out.print("금액을 입력하시오>>");
        money = sc.nextInt();
        won_50000 = money/50000;
        money = money - (won_50000*50000);
        won_10000 = money/10000;
        money = money - (won_10000*10000);
        won_1000 = money/1000;
        money = money - (won_1000*1000);
        won_100 = money/100;
        money = money - (won_100*100);
        won_50 = money/50;
        money = money - (won_50*50);
        won_10 = money/10;
        money = money - (won_10*10);
        won_1 = money/1;
        money = money - (won_1*1);

        System.out.println("오만원권 " + won_50000 + "매");
        System.out.println("만원권 " + won_10000 + "매");
        System.out.println("천원권 " + won_1000 + "매");
        System.out.println("백원 " + won_100 + "매");
        System.out.println("오십원 " + won_50 + "매");
        System.out.println("십원 " + won_10 + "매");
        System.out.println("일원 " + won_1 + "매");

        sc.close();
    }
}