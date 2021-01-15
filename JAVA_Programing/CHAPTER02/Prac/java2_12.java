/*
[2장 12번]


사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 +, -, *, /의 네 가지로 하고 피연산자는 모두 실수로 한다. 피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다. 0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.

[Hint] 연산자는 scanner.next()를 이용하여 문자열로 입력받으면 된다. 문자열 s가 "+"와 같은지 검사하려면 if(s.equals("+"))를 이용하며, true이면 s와 "+"가 같다.

연산>>2 + 4
2.0+4.0의 계산 결과는 6.0

(1) 연산 식을 구분할 때 if-else 문을 이용하여 프로그램을 작성하라.

(2) 연산 식을 구분할 때 switch 문을 이용하여 프로그램을 작성하라
*/

package Prac;
import java.util.Scanner;

public class java2_12 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     double a, c, result;
     String b; //연산자
     System.out.print("연산>>");
     a = sc.nextDouble();
     b = sc.next();
     c = sc.nextDouble();

     //(1)if-else 사용
     if(b.equals("+")){
         result=a+c;
         System.out.print(a+b+c+"의 계산결과는 "+ result);
     }
     else if(b.equals("-")){
         result=a-c;
         System.out.print(a+b+c+"의 계산결과는 "+ result);
     }
     else if(b.equals("*")){
        result=a*c;
        System.out.print(a+b+c+"의 계산결과는 "+ result);
    }
    else if(b.equals("/")){
        if(c==0){
            System.out.print("0으로 나눌 수 없습니다.");
        }
        else{
        result=a/c;
        System.out.print(a+b+c+"의 계산결과는 "+ result);
        }
    }
    
    //(2)switch 사용
    switch (b){
        case "+":
        result = a+c;
        System.out.print(a+b+c+"의 계산결과는 "+ result);
        break;
        case "-":
        result = a-c;
        System.out.print(a+b+c+"의 계산결과는 "+ result);
        break;
        case "*":
        result = a*c;
        System.out.print(a+b+c+"의 계산결과는 "+ result);
        break;
        case "/":
        if(c==0){
            System.out.print("0으로 나눌 수 없습니다.");
            break;
        }
        else{
            result = a/c;
            System.out.print(a+b+c+"의 계산결과는 "+ result);
            break;
        }
        default:
        System.out.print("잘못입력 하셨습니다.");
    }
    sc.close();

 }   
}