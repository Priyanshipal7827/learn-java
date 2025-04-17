// import java.util.*;

public class method{
    public static int printHello() {
        System.out.println("hello priyanshi");
        System.out.println("hello prianshi");
        System.out.println("what about you!");
        return 3;
    }

    public static int calculateSum(int num1, int num2 /* formal parameters */ ) {
        int sum = num1 + num2;
        return sum;
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int sumOf2(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float sumOf3(float a, float b, float c) {
        float sum = a + b + c;
        return sum;
    }

    public static boolean isPrime(int n) {
        // corner cases
        // for 2
        if (n == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void primeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void binTodec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal number is " + myNum + " = " + decNum);
    }

    public static void decTobin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary num is " + myNum + " = " + binNum);
    }

    // code for print hallow reactagle star pattern
    public static void hallow_rectangle(int totalrows, int totalcols) {
        for (int row = 1; row <= totalrows; row++) {
            for (int col = 1; col <= totalcols; col++) {
                if (row == 1 || row == totalrows || col == 1 || col == totalcols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    // code for inverted & rotated star pattern
    public static void inverted_pattern(int n) {
        // outer loop for lines
        for (int i = 1; i <= n; i++) {
            // inner first loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner second loop for print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // code for print inverted half pyramid numbers pattern
    public static void inverted_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // code for floyd's triangle
    public static void floyds_triangle(int n) {
        int counter = 1;
        // outer loop for print lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // code for print 1, 0 triangle pattern
    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { // for even condition
                    System.out.print("1");
                } else {
                    System.out.print("0"); // for odd condition
                }
            }
            System.out.println();
        }
    }

    // code for butterfly pattern
    public static void butterfly(int n) {
        // first half
        // for print lines
        for (int i = 1; i <= n; i++) {
            // inner loop for print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // inner loop for print space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // inner loop for print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // code for second half butterfly pattern
        // outer loop for print lines
        for (int i = n; i >= 1; i--) {
            // inner loop for print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // inner loop for print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // inner loop for print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // code for solid rhombus
    public static void solid_Rhombus(int n) {
        // outer loop for print lines
        for (int i = 1; i <= n; i++) {
            // inner loop for print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner loop for print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hallow_Rhombus(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    // code for print diamond pattern stars
    public static void diamond_pattern(int n){
        //first half diamond pattern
        //outer loop for print lines
        for(int i = 1; i <= n; i++){
            //inner loop for print spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //inner loop for print stars
            for(int j = 1; j <= (2*i)-1; j++ ){
                System.out.print("* ");
            }
            System.out.println();          
        }
        //second half diamond pattern 
        //outer loop for print lines
        for(int i = n; i >= 1; i--){
            //inner loop for print spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //inner loop for print stars
            for(int j = 1; j <= (2*i)-1; j++ ){
                System.out.print("* ");
            }
            System.out.println();            
        }
    }
    //code for triangle
    public static void triangle_rotated(int n){
        for(int i = 1; i <=n ; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // code for right rotated
    public static void right_trangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //code for up to down rotated pattern
    public static void upToDown(int n){
        for(int i=0; i<n; i++){
           
           for(int j=0; j<i; j++){
            System.out.print("  ");
           }
           for(int j=0; j<n-i; j++){
            System.out.print("* ");
           }
            
            System.out.println();
        }
    }   
    public static void main(String args[]) {
        binTodec(1101);
        decTobin(7);
        hallow_rectangle(5, 10);
        System.out.println("Next statement is started!");
        inverted_pattern(5);
        System.out.println("Next statement is started!");
        inverted_half_pyramid(5);
        System.out.println("Next statement is started!");
        floyds_triangle(5);
        System.out.println("Next statement is started!");
        triangle(5);
        System.out.println("Next statement is started!");
        butterfly(5);
        System.out.println("Next statement is started!");
        solid_Rhombus(5);
        System.out.println("Next statement is started!");
        hallow_Rhombus(5);
        System.out.println("Next statement is started!");
        diamond_pattern(5);
        System.out.println("Next statement is started!");
        triangle_rotated(5);
        System.out.println("Next statement is started!");
        right_trangle(5);
        System.out.println("hello priya");
        System.out.println("Next statement is started!");
        upToDown(5);
        // Scanner scn = new Scanner(System.in);
        // int a = scn.nextInt();
        // System.out.println("Swaping value a is : " + a);
        // int b = scn.nextInt();
        // System.out.println("Swaping value b is : " + b);
        // int prod = multiply(a, b);
        // System.out.println("product of two variables is : " + prod);
        // // ******factorial of n num *****************

        // System.out.println("Next statement is started!");
        // int fact = factorial(8);
        // System.out.println("Factorial is : " + fact);
        // scn.close();
        // System.out.println(sumOf2(3, 4));
        // System.out.println(sumOf3(2.5f,5.5f,6.5f));
        // System.out.println(isPrime(45));
        // primeinRange(100);

    }
}
