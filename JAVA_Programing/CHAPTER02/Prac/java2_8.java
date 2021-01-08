/*
2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다. 키보드로부터 직사각형을 구성하는 두 점 (x1, y1), (x2, y2)를 입력받아 (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하라.

[Hint] 다음은 점 (x,y)가 (rectx1, recty1), (rectx2, recty2)의 사각형 안에 있으면 true를 리턴하는 메소드이다. 이 메소드를 활용하라.

public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
    if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
        return true;
     else
        return false;
}
*/
package Prac;
import java.util.Scanner;

public class java2_8 {
    public static boolean inRect(int x, int y) {
        if((x >= 100&& x<=200) && (y>=100 && y<=200))
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, x2, y1, y2;
        boolean a, b;

        System.out.print("(x1,y1)값을 입력해 주세요.");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.print("(x2,y2)값을 입력해 주세요.");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        a = inRect(x1,x2);
        b = inRect(y1,y2);

        if(a == true || b == true){
            System.out.print("두 사각형은 충돌합니다.");
        }
        else{
            System.out.print("두 사각형은 충돌하지 않습니다.");
        }
        sc.close();


    }
}