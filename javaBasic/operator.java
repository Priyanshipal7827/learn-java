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



        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.println(exp1);
        System.out.println(exp2);

        // ************* question 2 **********
        int x1 = 200, y1 = 50, z1 = 100;
        if (x1 > y1 && y1 > z1) {
            System.out.println("Hello");
        }
        if (z1 > y1 && z1 < x1) {
            System.out.println("Java");
        }
        if ((y1 + 200) < x1 && (y1 + 150) < z1) {
            System.out.println("Hello Java");

        }

        // **************** question 3 **************
        int x2, y2, z2;
        x2 = y2 = z2 = 2;
        x2 += y2;
        y2 -= z2;
        z2 /= (x2 + y2);
        System.out.println(x2 + " " + y2 + " " + z2);

        // ************** question 4 ***********
        int x3 = 9, y3 = 12;
        int a1 = 2, b1 = 4, c1 = 6;
        int exp = 4 / 3 * (x3 + 34) + 9 * (a1 + b1 * c1) + (3 + y3 * (2 + a1)) / (a1 + b1 * y3);
        System.out.println(exp);

        // ************* question 5 ***************

        int x4 = 10, y4 = 5;
        int res1= (y4 * (x4 / y4 + x4 / y4));
        int res2 = (y4 * x4 / y4 + y4 * x4 / y4);
        System.out.println(res1);
        System.out.println(res2);
    }
}


   
