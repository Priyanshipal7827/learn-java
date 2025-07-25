import java.util.*;

public class loops {
    public static void main(String arg[]) {
        // learn loops
        int count = 1;
        while (count < 5) {
            System.out.println(count + " hello priyanshi!");
            count++;
        }
        // print 1 to 10 number using while loop
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
        // print number 1 to n
        // System.out.println("Print n numbers ");
        Scanner sc = new Scanner(System.in);
        // int i = 1;
        // int n = sc.nextInt();
        // while(i <= n){
        // System.out.println(i);
        // i++;
        // }

        // print sum of natural numbers
        System.out.println("print sum of natural numbers");
        System.out.print("Enter value of n1 : ");
        int j = 1;
        int n1 = sc.nextInt();
        int sum = 0;
        while (j <= n1) {
            sum += j;
            j++;
        }
        System.out.println("Sum is : " + sum);

        // foor loop
        // print hello world using for loop
        System.out.println("print hello world using for loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello world!");
        }
        // print squre pattern
        System.out.println("print square pattern using for loop.");
        for (int i = 1; i <= 4; i++) {
            System.out.println("* * * *");
        }
        // print reverse of given number
        System.out.print("Print reverse of numbers");
        int dig = sc.nextInt();
        while (dig > 0) {
            int lastdig = dig % 10;
            System.out.print(lastdig);
            dig /= 10;
        }
        // reverse method second
        int number = sc.nextInt();
        int rev = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            rev = (rev * 10) + lastdigit;
            number /= 10;
        }
        System.out.println(rev);

        // do while loop
        System.out.println("print hello world using do while loop");
        int k = 1;
        do {
            System.out.println("hello world!");
            k++;
        } while (k <= 5);

        // break statement
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        // question beark statement

        do {
            System.out.print("Enter your value : ");
            int val = sc.nextInt();
            if (val % 10 == 0) {
                break;
            }
            System.out.println(val);
        } while (true);

        // continue statement
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        // question using continue statement
        // do{
        // System.out.print("Enter your number : ");
        // int n = sc.nextInt();
        // if(n%10 == 0){
        // continue;
        // }
        // System.out.println("Number was : " + n);
        // } while(true);

        // check if a number is prime or not
        System.out.print("Check number is prime or not : ");

        int N = sc.nextInt();
        
        if (N == 2) {
            System.out.println("N is prime ");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= N - 1; i++) {
                if (N % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("N is a prime number " + N);
            } else {
                System.out.println("N is not prime number " + N);
            }
        }
        // optimized code 
        System.out.println("Check number is prime or not :");
        int N1 = sc.nextInt();
        
        if (N1 == 2) {
            System.out.println("N1 is prime ");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N1); i++) {
                if (N1 % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("N is a prime number " + N1);
            } else {
                System.out.println("N is not prime number " + N1);
            }
        }
sc.close();
    }

}
