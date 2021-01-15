/*
[2장 9번]


원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 그리고 실수 값으로 다른 점 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.

[HInt] 중심에서 점 (x, y) 사이의 거리가 반지름보다 작거나 같으면 원의 내부에 있다. 변수 x에 대한 제곱근의 값은 Math.sqrt(x)를 이용하면 된다. Math는 6장에서 설명한다.

원의 중심과 반지름 입력>>10 10 6.5
점 입력>>13 13
점 (13,13)는 원 안에 있다.
*/
package Prac;
import java.util.Scanner;
public class java2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, r_x, r_y;
        double r, distance;
        System.out.print("원의 중심과 반지름 입력>>");
        r_x = sc.nextInt();
        r_y = sc.nextInt();
        r = sc.nextDouble();
        System.out.print("점 입력>>");
        x = sc.nextInt();
        y = sc.nextInt();

        distance = Math.sqrt(((x-r_x)*(x-r_y))+((y-r_x)*(y-r_y)));
        if(distance<r){
            System.out.print("점 ("+x+","+y+")는 원 안에 있다.");
        }
        else{
            System.out.print("점 ("+x+","+y+")는 원 밖에 있다.");
        }
        sc.close();
    }
}