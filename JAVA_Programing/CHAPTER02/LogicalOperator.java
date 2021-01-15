public class LogicalOperator {
    public static void main(final String[] args) {
        // 비교 연산
        System.out.println('a'>'b');
        System.out.println(3>=2);
        System.out.println(-1<0);
        System.out.println(3.42<=2);
        System.out.println(3==2);
        System.out.println(3!=2);
        System.out.println(!(3!=2)); //!(true) -> false

        //비교 연산과 논리연산의 복합
        System.out.println((3>2) && (3>4));
        System.out.println((3!=2) || (-1>0)); //(3!=2)로 ture결정, (-1>0)은 취급 안해서 Dead code
        System.out.println((3!=2) ^ (-1>0));
    }
}