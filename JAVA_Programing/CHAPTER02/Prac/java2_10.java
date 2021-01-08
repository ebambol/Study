/*
[2장 10번]


원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다. 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.

첫번째 원의 중심과 반지름 입력>>10 10 3
두번째 원의 중심과 반지름 입력>>12 12 2
두 원은 서로 겹친다.
*/
package Prac;
import java.util.Scanner;

public class java2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2;
        double r1, r2, distance;
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        r1 = sc.nextDouble();
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        r2 = sc.nextDouble();

        distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        if(distance<=r1+r2){
            System.out.print("두 원은 서로 겹친다.");
        }
        else{
            System.out.print("두 원은 서료 겹치지 않는다");
        }
        sc.close();
    }
}