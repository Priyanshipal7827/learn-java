import java.util.*;

public class methods {

    // functions are block of code that perform a specific task

    public static void printHello() {
        System.out.println("Hello world!");
    }

    // function for calculate sum
    public static int calculateSum(int a, int b) { // parameters an formal parameters

        return a + b;

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
    public static int product(int x, int y) {

        return x * y;

    }

    // print table
    public static void printTable() {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i * n);
        }
    }

    // calculate the factorial is a number n , n = 4
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // find the binomial coefficient

    public static int bincoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    // function overloding : multiple function with same name but different
    // parameters

    // function for sum of two num
    public static int sumTwo(int a, int b) {
        return a + b;
    }

    // function for sum of three num
    public static int sumThree(int a, int b, int c) {
        return a + b + c;
    }

    // check number is prime or not
    // public static boolean isPrime(int n) {
    //     boolean isPrime = true;
    //     for (int i = 2; i <= n - 1; i++) {
    //         if (n % i == 0) {
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }

    // optimize solution of check number is prime or not

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
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
        System.out.println("Factorial is : " + factorial(4));
        printTable();
        System.out.println(bincoeff(5, 2));
        System.out.println(isPrime(7));
        sc.close();

    }
}
