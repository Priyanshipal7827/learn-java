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
        for(int i = 1; i <= 5; i++){
            System.out.println("hello world!");
        }
        //  print squre pattern 
        for(int i = 1; i <= 4; i++){
            System.out.println("* * * *");
        }
        // print reverse of given number
        int dig = sc.nextInt();
        while(dig > 0){
            int lastdig = dig%10;
            System.out.print(lastdig);
            dig /= 10;
        }

        sc.close();

    }
}
