import java.util.Scanner;

public class RockPaperScissors2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("����");
        String Chulsu, Yunghee;
        
        System.out.print("ö�� >> ");
        Chulsu = scanner.next();
        System.out.print("���� >> ");
        Yunghee = scanner.next();

        if(Chulsu.equals("����")){
            if(Yunghee.equals("����"))
                System.out.println("�����ϴ�.");
            else if(Yunghee.equals("����"))
                System.out.println("ö���� �����ϴ�.");
            else
                System.out.println("ö���� �̰���ϴ�.");
        }
        if(Chulsu.equals("����")){
            if(Yunghee.equals("����"))
                System.out.println("ö���� �̰���ϴ�.");
            else if(Yunghee.equals("����"))
                System.out.println("�����ϴ�.");
            else
                System.out.println("ö���� �����ϴ�.");
        }
        if(Chulsu.equals("��")){
            if(Yunghee.equals("����"))
                System.out.println("ö���� �����ϴ�.");
            else if(Yunghee.equals("��"))
                System.out.println("�����ϴ�.");
            else
                System.out.println("ö���� �̰���ϴ�.");
        }

    scanner.close();
    }
}