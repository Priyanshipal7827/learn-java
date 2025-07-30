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

    // swap values

    public static void swap(int num1, int num2) {

        // swap
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = : " + num1);
        System.out.println("num2 = : " + num2);

    }

    // find the product of x & y 
   public static int product(int x , int y){
    int product = x*y;
    return product;
    
   }

    public static void main(String[] args) {
        // calculate sum 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
         System.out.println("sum is : " + sum);
        // swap numbers
        int num1 = 4;
        int num2 = 2; 
        
        // product of x & y 
        // int x = 3;
        // int y = 5;
        
        // call functions
        swap(num1, num2);
        printHello();
        int prod = product(3, 5);
        System.out.println("product is : " + prod);
        sc.close();

    }
}
