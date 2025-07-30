import java.util.*;

public class methods {

    // functions are block of code that perform a specific task
    // syntax retuenType name (){
    // to do work
    // return statement;
    // }

    public static void printHello() {
        System.out.println("Hello world!");
    }

    // function for calculate sum
    public static int calculateSum(int a, int b) { // parameters an formal parameters
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
         sc.close();
        return sum;
    }

    // swap values

    public static void swap(int num1, int num2) {
        int num1 = 4;
        int num2 = 2;
        // swap
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(" num1 = : " + num1);
        System.out.println(" num2 = : " + num2);

    }

    public static void main(String[] args) {
        calculateSum(a, b);
        printHello();
       
    }
}
