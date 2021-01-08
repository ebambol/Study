public class AssignmentIncDecOperator {
    public static void main(String[] args) {
        int a=3, b=3, c=3;
        //대입 연산자 사례
        a += 3;
        b *= 3;
        c %= 3;
        System.out.println("a=" + a + ", b= "+ b + ", c="+ c);

        int d=3;
        //증감 연산자 사례
        a = d++; //a=3, d=4
        System.out.println("a=" + a + ", d=" + d);
        a = ++d; //a=5, d=5
        System.out.println("a=" + a + ", d=" + d);
        a = d--; //a=5, d=4
        System.out.println("a=" + a + ", d=" + d);
        a = --d; //a=3, d=3
        System.out.println("a=" + a + ", d=" + d);
        
        int x=2, y=10, z=0;
        z = x++*2+--y-5+x*(y%2);
        System.out.println("x=" + x + ", y=" + y +", z=" + z);
    }
}