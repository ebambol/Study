/*
[2장 11번]


숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~11은 "가을", 12,0,1의 경우 "겨울"을, 그 외 숫자를 입력한 경우 "잘못입력"을 출력하는 프로그램을 작성하라.

달을 입력하세요(1~12)>>9
가을

(1) if-else 문을 이용하여 프로그램을 작성하라.

(2) switch 문을 이용하여 프로그램을 작성하라.
*/

package Prac;
import java.util.Scanner;

public class java2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("달을 입력하세요(1~12)>>");
        num = sc.nextInt();

        //(1) if-else문 사용
        if(3 <= num && num <=5)
        System.out.print("봄");
        else if(6 <= num && num <=8)
        System.out.print("여름");
        else if(9 <= num && num <=11)
        System.out.print("가을");
        else if(12 == num || num == 0 || num == 1)
        System.out.print("겨울");
        else
        System.out.print("잘못입력");

        //(2) switch문 사용
        switch (num){
        case 0:
        case 1:
        System.out.print("겨울");
        break;
        case 3:
        case 4:
        case 5:
        System.out.print("봄");
        break;
        case 6:
        case 7:
        case 8:
        System.out.print("여름");
        break;
        case 9:
        case 10:
        case 11:
        System.out.print("가을");
        break;
        case 12:
        System.out.print("겨울");
        break;
        default:
        System.out.print("잘못입력");
        break;
        }

        sc.close();

    }
    

    
}