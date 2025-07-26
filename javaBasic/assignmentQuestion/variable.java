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





        // ****************question 2 *********
        System.out.print("Enter value of side : ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of side : " + area);




        // *******************question 3 ************
        System.out.print("Enter the price of pencil : ");
        int pencil = sc.nextInt();
        System.out.print("Enter the price of pen : ");
        int pen = sc.nextInt();
        System.out.print("Enter the price of eraser : ");
        int eraser = sc.nextInt();
        int total = (pen+pencil+eraser);
        System.out.println("Total is : " + total);
        float newTotal = (total * 0.18f) + total;
        System.out.println("GST of items : " + newTotal);



        // *************** question 4 **********

        byte B = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*B) + (i/c) - (d*s);
        System.out.println(result);
        

        




        sc.close();
    }
}
