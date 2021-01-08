import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
        String Chulsu, Yunghee;
        
        System.out.print("철수 >> ");
        Chulsu = scanner.next();
        System.out.print("영희 >> ");
        Yunghee = scanner.next();

        if(Chulsu.equals("가위")){
            if(Yunghee.equals("가위"))
                System.out.println("비겼습니다.");
            else if(Yunghee.equals("바위"))
                System.out.println("철수가 졌습니다.");
            else
                System.out.println("철수가 이겼습니다.");
        }
        if(Chulsu.equals("바위")){
            if(Yunghee.equals("가위"))
                System.out.println("철수가 이겼습니다.");
            else if(Yunghee.equals("바위"))
                System.out.println("비겼습니다.");
            else
                System.out.println("철수가 졌습니다.");
        }
        if(Chulsu.equals("보")){
            if(Yunghee.equals("가위"))
                System.out.println("철수가 졌습니다.");
            else if(Yunghee.equals("보"))
                System.out.println("비겼습니다.");
            else
                System.out.println("철수가 이겼습니다.");
        }

    scanner.close();
    }
}