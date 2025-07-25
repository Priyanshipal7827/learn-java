package assignmentQuestion;

import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b ;
        System.out.println("Sum of two numbers : " + sum);

          // ***********Question 1 ***************
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int avg = (x+y+z)/3;
        System.out.println("Average of three number : " + avg);
        sc.close();
    }
}
