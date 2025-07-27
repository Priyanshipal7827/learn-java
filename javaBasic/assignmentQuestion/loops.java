package assignmentQuestion;
import java.util.*;


public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // learn loops
        // while loop

        // int n = 1;
        // while (n <= 5) {
        // System.out.println("hello priyanshi! " + n);
        // n++;
        // }

        // do while loop
        int newNum = 1;
        do {
            System.out.print(newNum);
            newNum++;
        } while (newNum <= 5);

        // for loop

        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }

        // ************ question 1 ****************
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
            // i += 2;
        }

        // ***************** question 4 ************
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " * " + n + " = " + i*n );
        }

        // ****************** question 5************
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        sc.close();

    }

}
