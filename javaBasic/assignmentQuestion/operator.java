package assignmentQuestion;

public class operator {
    public static void main(String[] args) {
        // ************ question 1 *********

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



        //  **************** question 4
    }
}