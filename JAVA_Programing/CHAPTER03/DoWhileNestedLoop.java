public class DoWhileNestedLoop {
    public static void main(String[] args) {
        int i;
        i=5;
        do{
            int j = 0;
            while (j++<i)
            System.out.print("*");
            System.out.println();
            i--;
        }while(i>0);
    }
}