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
        // int newNum = 1;
        // do {
        // System.out.print(newNum);
        // newNum++;
        // } while (newNum <= 5);

        // for loop

        // for (int k = 1; k <= 5; k++) {
        // System.out.println(k);
        // }

        // // ************ question 1 ****************
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello " + i);
        // // i += 2;
        // }

        // ****************** question 2 ************
        // int number = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i<=number; i++){
        // sum += i ;
        // }
        // System.out.println(sum);

        // ******************** question 3 **************
        // print table of n number

        // for(int i = 1; i <= 10; i++){
        // System.out.println(number*i);
        // }

        // ***************** question 4 ************
        // System.out.print("Enter the value : ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // System.out.println(i + " * " + n + " = " + i*n );
        // }

        // ****************** question 5************
        // for (int i = 0; i <= 5; i++) {
        // System.out.println("i = " + i);
        // }

        // ************ question no 6 **************

        int i = 0;
        int j = 10;
        while (i < j) {
            System.out.println(i+ " " + j);
            i++;
            j--;
        }

        sc.close();

    }

}
