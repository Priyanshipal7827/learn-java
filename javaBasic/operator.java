public class operator {
    public static void main(String arg[]) {
        // ********** learn operators*********
        // Arithamatic operator
        // binary arithmatic operator
        int a = 10;
        int b = 5;
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        // unarry arithmatic operattor
        // int a = 10;
        // int b = ++a;
        // System.out.println(b);
        // *****************relational operators********************
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        //***********logical operators**************
        // AND operator
        System.out.println((3>2) && (5>0) );
        // OR operstor
        System.out.println((3<2) || (5>0) );
        // NOT operator
        System.out.println( !(3>2));
        // **************Assignment operators******************
        a += a;
        b -= a;
        a *= a;
        a /= a;
        a %= a;
        System.out.println(b);




    }
}
