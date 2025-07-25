package assignmentQuestion;

import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of two numbers : " + sum);

        // ***********Question 1 ***************
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 : ");
        float x = sc.nextFloat();
        System.out.print("Enter num 2 : ");
        float y = sc.nextFloat();
        System.out.print("Enter num 3 : ");
        float z = sc.nextFloat();
        float avg = (x + y + z) / 3;
        System.out.println("Average of three number : " + avg);
        sc.close();
    }
}
