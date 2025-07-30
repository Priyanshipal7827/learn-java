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
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println("sum is : " + sum);
        printHello(); // function call
        sc.close();
    }
}
